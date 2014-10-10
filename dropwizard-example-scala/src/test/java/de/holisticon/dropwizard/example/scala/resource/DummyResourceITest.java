package de.holisticon.dropwizard.example.scala.resource;

import de.holisticon.dropwizard.example.scala.itest.ScalaExampleRule;
import org.junit.ClassRule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import static org.assertj.core.api.Assertions.*;

public class DummyResourceITest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @ClassRule
    public static final ScalaExampleRule DW = new ScalaExampleRule();

    private final String endpoint = DW.getEndpoint();

    @Test
    public void returns_name() {
        logger.info("connect to: {}", endpoint);

        final Client client = ClientBuilder.newBuilder().build();
        assertThat(client.target(endpoint).request().get().readEntity(String.class)).isEqualTo("Person(jan)");
    }

}