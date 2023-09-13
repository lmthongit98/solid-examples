package ocp.before;

import ocp.model.Variable;
import ocp.model.VariableDataDto;

import java.util.ArrayList;
import java.util.List;

public class VariableDataService {

    public List<VariableDataDto> fetchVariableDataFromInternal(List<String> applicationIds, Variable variable) {
        return new ArrayList<>();
    }

    public List<VariableDataDto> fetchVariableDataFromSql(List<String> applicationIds, Variable variable) {
        return new ArrayList<>();
    }

    public List<VariableDataDto> fetchVariableDataFromApi(List<String> applicationIds, Variable variable) {
        return new ArrayList<>();
    }
}
