package ru.tinkoff.load.javaapi.actions;

import io.gatling.javaapi.core.ActionBuilder;

public class QueryActionBuilder implements ActionBuilder {
    private final ru.tinkoff.load.jdbc.actions.actions.QueryActionBuilder wrapped;

    public QueryActionBuilder(ru.tinkoff.load.jdbc.actions.actions.QueryActionBuilder wrapped){
        this.wrapped = wrapped;
    }

    @Override
    public io.gatling.core.action.builder.ActionBuilder asScala() {
        return this.wrapped;
    }
}
