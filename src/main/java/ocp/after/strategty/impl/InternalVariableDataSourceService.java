package ocp.after.strategty.impl;

import ocp.after.strategty.VariableDataSourceService;
import ocp.model.DataSource;
import ocp.model.Variable;
import ocp.model.VariableDataDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InternalVariableDataSourceService implements VariableDataSourceService {

    @Override
    public List<VariableDataDto> fetchVariableData(List<String> applicationIds, Variable variable) {
        // implement fetch variable data from INTERNAL
        return new ArrayList<>();
    }

    @Override
    public DataSource getDataSource() {
        return DataSource.INTERNAL;
    }
}
