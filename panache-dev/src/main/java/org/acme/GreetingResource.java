package org.acme;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/hello")
public class GreetingResource {

    @GET
    public List<Greeting> hello() {
        return Greeting.listAll();
    }

    @POST
    @Transactional
    public Greeting save(Greeting greeting) {
        greeting.persist();

        return greeting;
    }
}