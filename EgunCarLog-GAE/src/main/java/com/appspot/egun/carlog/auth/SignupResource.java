package com.appspot.egun.carlog.auth;

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
@Path("/auth/")
public class SignupResource
{
    private static final Logger logger = Logger.getLogger( SignupResource.class.getSimpleName() );

    @GET
    @Path("/signupForm")
    public Viewable index()
    {
        logger.log( Level.WARNING, "call SignupResource" );
        return new Viewable( "/auth/signupForm" );
    }
    
    
}
