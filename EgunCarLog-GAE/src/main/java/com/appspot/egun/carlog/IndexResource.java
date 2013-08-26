package com.appspot.egun.carlog;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

import com.sun.jersey.api.view.Viewable;
import com.sun.jersey.spi.resource.Singleton;

@Component
@Singleton
@Produces("text/html")
@Path("/")
public class IndexResource
{
    /** log */
    private static final Logger logger = Logger.getLogger( IndexResource.class.getSimpleName() );
    
    @GET
    @Path("/")
    public Viewable firstPage() {
    	logger.log( Level.WARNING, "call IndexResource firstPage" );
    	return new Viewable("/index");
    }
}
