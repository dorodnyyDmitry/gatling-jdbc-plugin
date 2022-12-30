package ru.tinkoff.load.javaapi.actions;

public class BatchInsertBaseAction {
    private final ru.tinkoff.load.jdbc.actions.actions.BatchInsertBaseAction wrapped;

    public BatchInsertBaseAction(ru.tinkoff.load.jdbc.actions.actions.BatchInsertBaseAction batchInsertBaseAction){
        this.wrapped = batchInsertBaseAction;
    }
}
