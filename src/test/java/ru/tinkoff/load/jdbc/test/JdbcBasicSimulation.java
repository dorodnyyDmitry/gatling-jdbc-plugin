package ru.tinkoff.load.jdbc.test;

import io.gatling.javaapi.core.ScenarioBuilder;

import static io.gatling.javaapi.core.CoreDsl.scenario;

public class JdbcBasicSimulation {
    public static ScenarioBuilder scn = scenario("JDBC scenario")
            .exec(JdbcActions.createTable());
}
