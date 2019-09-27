package com.bbva.api;

import com.bbva.api.beans.Location;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/location")
public interface LocationResource {
  @Path("/{id}")
  @GET
  @Produces("application/json")
  Location generatedMethod2(@PathParam("id") int id);
}
