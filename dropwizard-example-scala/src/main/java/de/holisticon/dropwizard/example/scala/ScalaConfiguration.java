package de.holisticon.dropwizard.example.scala;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class ScalaConfiguration extends Configuration {

    @JsonProperty
    public String name;
}
