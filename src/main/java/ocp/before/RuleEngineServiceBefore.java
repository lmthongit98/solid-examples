package ocp.before;

import ocp.model.Variable;
import ocp.model.VariableDataDto;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RuleEngineServiceBefore {

    private final VariableDataService variableDataService;

    public RuleEngineServiceBefore(VariableDataService variableDataService) {
        this.variableDataService = variableDataService;
    }

    public List<String> getEligibleLenders(List<String> applicationIds) {
        return new ArrayList<>();
    }

    public void sendEmail() {

    }

    public void validate() {

    }


    public Map<String, Map<String, Object>> getApplicationVariableDataMap(List<String> applicationIds, List<Variable> variables) {
        Map<String, Map<String, Object>> applicationVariableDataMap = applicationIds.stream().collect(Collectors.toMap(Function.identity(), appId -> new HashMap<>()));
        for (Variable variable : variables) {
            List<VariableDataDto> variableDataDTOS = switch (variable.getDatasource()) {
                case API -> variableDataService.fetchVariableDataFromApi(applicationIds, variable);
                case SQL -> variableDataService.fetchVariableDataFromSql(applicationIds, variable);
                case INTERNAL -> variableDataService.fetchVariableDataFromInternal(applicationIds, variable);
            };
            for (VariableDataDto variableDataDto : variableDataDTOS) {
                applicationVariableDataMap.get(variableDataDto.getApplicationId()).put(variable.getVariableName(), variableDataDto.getValue());
            }
        }
        return applicationVariableDataMap;
    }


}