package ru.tinkoff.load.jdbc.test;

import ru.tinkoff.load.javaapi.actions.RawSqlActionBuilder;
import ru.tinkoff.load.javaapi.JdbcDsl;

public class JdbcActions {
    public static RawSqlActionBuilder createTable(){
        return JdbcDsl.jdbc("Create Table")
                .rawSql("CREATE TABLE TEST_TABLE (ID INT PRIMARY KEY, NAME VARCHAR(64), CREATED_AT DATE DEFAULT now(), flag BOOLEAN DEFAULT false);" +
          "CREATE TABLE TT (ID UUID, NAME VARCHAR(64));");
    }
}
