package ru.tinkoff.load.jdbc.test;

import io.gatling.javaapi.core.Simulation;

import static io.gatling.javaapi.core.OpenInjectionStep.atOnceUsers;
import static ru.tinkoff.load.jdbc.test.JdbcBasicSimulation.scn;

public class JdbcDebugTest extends Simulation {
    {
        setUp(
                scn.injectOpen(atOnceUsers(1))
        ).protocols(JdbcProtocol.dataBase);
    }
}
