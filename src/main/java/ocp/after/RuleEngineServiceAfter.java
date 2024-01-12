package ocp.after;

import ocp.after.factory.VariableDataResolver;
import ocp.model.Variable;
import ocp.model.VariableDataDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class RuleEngineServiceAfter {

    private final VariableDataResolver variableDataResolver;

    public RuleEngineServiceAfter(VariableDataResolver variableDataResolver) {
        this.variableDataResolver = variableDataResolver;
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
            List<VariableDataDto> variableDataDTOS = variableDataResolver.getVariableData(applicationIds, variable);
            for (VariableDataDto variableDataDto : variableDataDTOS) {
                applicationVariableDataMap.get(variableDataDto.getApplicationId()).put(variable.getVariableName(), variableDataDto.getValue());
            }
        }
        return applicationVariableDataMap;
    }

}