package ru.tinkoff.load.javaapi.actions;

import io.gatling.javaapi.core.Session;
import io.gatling.javaapi.core.internal.Expressions;
import org.checkerframework.framework.qual.JavaExpression;
import ru.tinkoff.load.javaapi.internal.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static scala.jdk.javaapi.CollectionConverters.asScala;
public class QueryActionParamsStep {
    private final ru.tinkoff.load.jdbc.actions.actions.QueryActionParamsStep wrapped;

    public QueryActionParamsStep(ru.tinkoff.load.jdbc.actions.actions.QueryActionParamsStep wrapped){
        this.wrapped = wrapped;
    }

    public QueryActionBuilder params(Map<String, Function<Session,Object>>... ps){
        return new QueryActionBuilder  (wrapped.params(
                asScala(
                        Arrays
                                .stream(ps)
                                .map(Utils.INSTANCE::javaObjectMapToScalaExpressionTuple)
                                .toList())
                        .toSeq()
        ));
    }
}
