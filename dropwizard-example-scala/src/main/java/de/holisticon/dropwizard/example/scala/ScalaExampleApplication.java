package de.holisticon.dropwizard.example.scala;


import com.codahale.metrics.health.HealthCheck;
import de.holisticon.dropwizard.example.scala.resource.DummyResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ScalaExampleApplication extends Application<ScalaConfiguration> {

    @Override
    public void initialize(Bootstrap<ScalaConfiguration> exampleConfigurationBootstrap) {

    }

    @Override
    public void run(final ScalaConfiguration configuration, final Environment environment) throws Exception {
        environment.jersey().register(new DummyResource(configuration));
        environment.healthChecks().register("dummy", new HealthCheck() {
            @Override
            protected Result check() throws Exception {
                return Result.healthy();
            }
        });
    }

    public static void main(String... args) throws Exception {
        new ScalaExampleApplication().run(args);
    }


    public static class Runner {
        public static void main(String... _) throws Exception {
            new ScalaExampleApplication().run(new String[]{"server"});
        }
    }
}
