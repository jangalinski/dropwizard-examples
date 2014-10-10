package de.holisticon.dropwizard.example.api;


import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SimpleExampleApplication extends Application<SimpleExampleApplication.SimpleConfiguration> {

    public static class SimpleConfiguration extends Configuration {

    }

    @Override
    public void initialize(Bootstrap<SimpleConfiguration> exampleConfigurationBootstrap) {

    }

    @Override
    public void run(SimpleConfiguration configuration, Environment environment) throws Exception {

    }

    public static void main(String... args) throws Exception {
        new SimpleExampleApplication().run(args);
    }


    public static class Runner {
        public static void main(String... _) throws Exception {
            new SimpleExampleApplication().run("server");
        }
    }
}
