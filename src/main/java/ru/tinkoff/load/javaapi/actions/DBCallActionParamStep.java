package ru.tinkoff.load.javaapi.actions;

import io.gatling.javaapi.core.Session;

import static scala.jdk.javaapi.CollectionConverters.asScala;
import ru.tinkoff.load.javaapi.internal.Utils;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;

public class DBCallActionParamStep {
    private final ru.tinkoff.load.jdbc.actions.actions.DBCallActionParamsStep wrapped;

    public DBCallActionParamStep(ru.tinkoff.load.jdbc.actions.actions.DBCallActionParamsStep wrapped){
        this.wrapped = wrapped;
    }

    public DBCallActionBuilder params(Map<String, Function<Session,Object>>... ps){
        return new DBCallActionBuilder(wrapped.params(
                asScala(
                        Arrays
                                .stream(ps)
                                .map(Utils.INSTANCE::javaObjectMapToScalaExpressionTuple)
                                .toList())
                        .toSeq()
        ));
    }
}
