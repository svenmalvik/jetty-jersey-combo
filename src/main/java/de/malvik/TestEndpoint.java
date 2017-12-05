package de.malvik;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by smalvik on 05.12.2017.
 */
@Path("/api")
public class TestEndpoint {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("ping")
    public String ping() {
        return "pong";
    }
}
