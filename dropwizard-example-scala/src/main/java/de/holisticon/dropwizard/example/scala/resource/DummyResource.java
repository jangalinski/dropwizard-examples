package de.holisticon.dropwizard.example.scala.resource;

import de.holisticon.dropwizard.example.api.Person;
import de.holisticon.dropwizard.example.scala.ScalaConfiguration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class DummyResource {


    private final ScalaConfiguration configuration;

    public DummyResource(ScalaConfiguration configuration) {
        this.configuration = configuration;
    }

    @GET
    public String name() {
        return new Person(configuration.name).toString();
    }
}
