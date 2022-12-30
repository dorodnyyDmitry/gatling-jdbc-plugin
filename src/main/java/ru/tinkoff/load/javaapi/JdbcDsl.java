package ru.tinkoff.load.javaapi;

import io.gatling.javaapi.core.internal.Expressions;
import ru.tinkoff.load.javaapi.actions.BatchInsertBaseAction;
import ru.tinkoff.load.javaapi.actions.BatchUpdateBaseAction;
import ru.tinkoff.load.javaapi.actions.DBBaseAction;
import ru.tinkoff.load.javaapi.protocol.JdbcProtocolBuilderBase;
import ru.tinkoff.load.jdbc.actions.actions;

import javax.annotation.Nonnull;

public final class JdbcDsl {
    private JdbcDsl(){}

    public static JdbcProtocolBuilderBase DB(){
        return new JdbcProtocolBuilderBase();
    }
    @Nonnull
    public static DBBaseAction jdbc(@Nonnull String name){
        return new DBBaseAction(ru.tinkoff.load.jdbc.Predef.jdbc(Expressions.toStringExpression(name)));
    }

    @Nonnull
    public static BatchInsertBaseAction insetInto(@Nonnull String tableName, actions.Columns columns){
        return new BatchInsertBaseAction(ru.tinkoff.load.jdbc.Predef.insertInto(Expressions.toStringExpression(tableName), columns));
    }

    @Nonnull
    public static BatchUpdateBaseAction update(@Nonnull String tableName){
        return new BatchUpdateBaseAction(ru.tinkoff.load.jdbc.Predef.update(Expressions.toStringExpression(tableName)));
    }
}
