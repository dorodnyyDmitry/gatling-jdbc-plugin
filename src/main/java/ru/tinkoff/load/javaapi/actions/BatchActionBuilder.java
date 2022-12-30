package ru.tinkoff.load.javaapi.actions;

public class BatchActionBuilder {
    private final ru.tinkoff.load.jdbc.actions.actions.BatchActionBuilder wrapped;

    public BatchActionBuilder(ru.tinkoff.load.jdbc.actions.actions.BatchActionBuilder batchActionBuilder){
        this.wrapped = batchActionBuilder;
    }


}
