package ru.tinkoff.load.javaapi.actions;

public class BatchUpdateBaseAction {

    private final ru.tinkoff.load.jdbc.actions.actions.BatchUpdateBaseAction wrapped;
    public BatchUpdateBaseAction(ru.tinkoff.load.jdbc.actions.actions.BatchUpdateBaseAction batchUpdateBaseAction) {
        this.wrapped = batchUpdateBaseAction;
    }
}
