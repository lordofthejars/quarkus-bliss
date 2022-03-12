package org.acme;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.security.identity.SecurityIdentity;

@Path("/hello")
public class GreetingResource {

    @Inject
    SecurityIdentity securityIdentity;

    @GET
    @RolesAllowed("admin")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello " + securityIdentity.getPrincipal().getName();
    }
}