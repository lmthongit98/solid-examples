package ocp.after.factory.impl;

import ocp.after.factory.VariableDataResolver;
import ocp.after.strategty.VariableDataSourceService;
import ocp.after.strategty.impl.ApiVariableDataSourceService;
import ocp.after.strategty.impl.InternalVariableDataSourceService;
import ocp.after.strategty.impl.SqlVariableDataSourceService;
import ocp.model.Variable;

import java.util.List;

public class VariableDataSourceFactory extends VariableDataResolver {

    @Override
    protected VariableDataSourceService getVariableDataSourceService(List<String> applicationId, Variable variable) {
        return switch (variable.getDatasource()) {
            case API -> new ApiVariableDataSourceService();
            case SQL -> new SqlVariableDataSourceService();
            case INTERNAL -> new InternalVariableDataSourceService();
        };
    }

}
