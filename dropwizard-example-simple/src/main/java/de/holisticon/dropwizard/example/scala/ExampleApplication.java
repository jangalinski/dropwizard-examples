package de.holisticon.dropwizard.example.scala;


import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ExampleApplication extends Application<ExampleConfiguration> {

    @Override
    public void initialize(Bootstrap<ExampleConfiguration> exampleConfigurationBootstrap) {

    }

    @Override
    public void run(ExampleConfiguration exampleConfiguration, Environment environment) throws Exception {

    }

    public static void main(String... args) throws Exception {
        new ExampleApplication().run(args);
    }


    public static class Runner {
        public static void main(String... _) throws Exception {
            new ExampleApplication().run(new String[]{"server"});
        }
    }
}
