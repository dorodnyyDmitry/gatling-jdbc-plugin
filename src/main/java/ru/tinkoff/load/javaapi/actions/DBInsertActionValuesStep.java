package ru.tinkoff.load.javaapi.actions;

import io.gatling.javaapi.core.Session;
import ru.tinkoff.load.javaapi.internal.Utils;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;


import static scala.jdk.javaapi.CollectionConverters.asScala;

public class DBInsertActionValuesStep {
    private final ru.tinkoff.load.jdbc.actions.actions.DBInsertActionValuesStep wrapped;

    public DBInsertActionValuesStep(ru.tinkoff.load.jdbc.actions.actions.DBInsertActionValuesStep wrapped){
        this.wrapped = wrapped;
    }

    public DBInsertActionBuilder values(Map<String, Function<Session,Object>>... ps){
        return new DBInsertActionBuilder (wrapped.values(
                asScala(
                        Arrays
                                .stream(ps)
                                .map(Utils.INSTANCE::javaObjectMapToScalaExpressionTuple)
                                .toList())
                        .toSeq()
        ));
    }
}