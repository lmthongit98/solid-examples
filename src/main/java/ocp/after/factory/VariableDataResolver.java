package ocp.after.factory;

import ocp.after.strategty.VariableDataSourceService;
import ocp.model.Variable;
import ocp.model.VariableDataDto;

import java.util.List;

public abstract class VariableDataResolver {

    protected abstract VariableDataSourceService getVariableDataSourceService(List<String> applicationIds, Variable variable);

    public List<VariableDataDto> getVariableData(List<String> applicationIds, Variable variable) {
        VariableDataSourceService variableDataSourceService = getVariableDataSourceService(applicationIds, variable);
        return variableDataSourceService.fetchVariableData(applicationIds, variable);
    }

}
