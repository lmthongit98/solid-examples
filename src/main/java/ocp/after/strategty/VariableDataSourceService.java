package ocp.after.strategty;

import ocp.model.DataSource;
import ocp.model.Variable;
import ocp.model.VariableDataDto;

import java.util.List;

public interface VariableDataSourceService {
    List<VariableDataDto> fetchVariableData(List<String> applicationIds, Variable variable);
    DataSource getDataSource();
}
