package ru.tinkoff.load.javaapi.internal;

import io.gatling.commons.validation.Validation;
import io.gatling.javaapi.core.Session;
import scala.Function1;
import scala.Tuple2;

import static io.gatling.javaapi.core.internal.Expressions.javaObjectFunctionToExpression;

import java.util.Map;
import java.util.function.Function;

public final class Utils {
    public static final Utils INSTANCE = new Utils();

    public Tuple2<String, Function1<io.gatling.core.session.Session, Validation<Object>>> javaObjectMapToScalaExpressionTuple(Map<String, Function<Session, Object>> pMap){
        Map.Entry<String, Function<Session, Object>> param = pMap
                .entrySet()
                .iterator()
                .next();

        return new Tuple2<>(param.getKey(), javaObjectFunctionToExpression(param.getValue()));
    }
}
