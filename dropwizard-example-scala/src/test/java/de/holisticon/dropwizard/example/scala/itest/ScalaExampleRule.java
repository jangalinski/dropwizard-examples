package de.holisticon.dropwizard.example.scala.itest;

import de.holisticon.dropwizard.example.scala.ScalaConfiguration;
import de.holisticon.dropwizard.example.scala.ScalaExampleApplication;
import io.dropwizard.testing.ResourceHelpers;
import io.dropwizard.testing.junit.DropwizardAppRule;

public class ScalaExampleRule extends DropwizardAppRule<ScalaConfiguration> {


    public ScalaExampleRule() {
        super(ScalaExampleApplication.class, ResourceHelpers.resourceFilePath("configuration.yaml"));
    }

    public String getEndpoint() {
        return String.format("http://localhost:%s/", getLocalPort());
    }
}
