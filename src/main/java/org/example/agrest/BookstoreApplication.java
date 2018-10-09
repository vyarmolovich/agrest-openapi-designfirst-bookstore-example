package org.example.agrest;

import io.agrest.runtime.AgBuilder;
import io.agrest.runtime.AgRuntime;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api/*")
public class BookstoreApplication extends ResourceConfig {

    public BookstoreApplication() {

        ServerRuntime cayenneRuntime
                = ServerRuntime.builder()
                               .addConfig("cayenne-project.xml")
                               .build();

        AgRuntime agRuntime = AgBuilder.build(cayenneRuntime);
        super.register(agRuntime);

        packages("org.example.agrest");

    }
}
