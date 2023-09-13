package ocp.after.strategty.impl;

import ocp.after.strategty.VariableDataSourceService;
import ocp.model.DataSource;
import ocp.model.Variable;
import ocp.model.VariableDataDto;

import java.util.ArrayList;
import java.util.List;

public class ApiVariableDataSourceService implements VariableDataSourceService {

    @Override
    public List<VariableDataDto> fetchVariableData(List<String> applicationIds, Variable variable) {
        // implement fetch variable data from API
        return new ArrayList<>();
    }

    @Override
    public DataSource getDataSource() {
        return DataSource.API;
    }
}
