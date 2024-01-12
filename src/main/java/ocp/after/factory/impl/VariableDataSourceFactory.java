package ocp.after.factory.impl;

import ocp.after.factory.VariableDataResolver;
import ocp.after.strategty.VariableDataSourceService;
import ocp.model.DataSource;
import ocp.model.Variable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class VariableDataSourceFactory extends VariableDataResolver {

    final Map<DataSource, VariableDataSourceService>  variableDataSourceServiceMap;

    public VariableDataSourceFactory(List<VariableDataSourceService> list) {
        variableDataSourceServiceMap = list.stream().collect(Collectors.toMap(VariableDataSourceService::getDataSource, Function.identity()));
    }


    @Override
    protected VariableDataSourceService getVariableDataSourceService(List<String> applicationId, Variable variable) {
        return variableDataSourceServiceMap.get(variable.getDataSource());
    }

}
