package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DestinationApiService;
import io.swagger.api.factories.DestinationApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.DestinationItem;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

import javax.validation.constraints.*;


@Path("/destination")


@io.swagger.annotations.Api(description = "the destination API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T15:16:48.319Z[GMT]")

public class DestinationApi  {
   private final DestinationApiService delegate;

   public DestinationApi(@Context ServletConfig servletContext) {
      DestinationApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DestinationApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DestinationApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = DestinationApiServiceFactory.getDestinationApi();
      }

      this.delegate = delegate;
   }


    @POST
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "add a new destination in system", notes = "add a new destination in system", response = Void.class, tags={ "Destination", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Destination created", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid Destination Input", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Destination already exist", response = Void.class) })
    public Response adddestination(@ApiParam(value = "Destination to store" ,required=true) DestinationItem body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.adddestination(body,securityContext);
    }

    @DELETE
    @Path("/{destinationId}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a destination", notes = "", response = Void.class, tags={ "Destination", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Destination not found", response = Void.class) })
    public Response deleteDestination(@ApiParam(value = "Destination id to delete",required=true) @PathParam("destinationId") Long destinationId
,@ApiParam(value = "" )@HeaderParam("api_key") String apiKey
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteDestination(destinationId,apiKey,securityContext);
    }

    @GET
    @Path("/{destinationId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find destination by ID", notes = "Returns a single destination", response = DestinationItem.class, tags={ "Destination", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DestinationItem.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Destination not found", response = Void.class) })
    public Response getDestinationById(@ApiParam(value = "ID of destination to return",required=true) @PathParam("destinationId") Long destinationId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getDestinationById(destinationId,securityContext);
    }

    @GET
    
    
    @Produces({ "*/*" })
    @io.swagger.annotations.ApiOperation(value = "returns all registried destinations.", notes = "returns all registried destinations.", response = DestinationItem.class, responseContainer = "List", tags={ "Destination", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = DestinationItem.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "", response = Void.class) })
    public Response getalldestinations(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getalldestinations(securityContext);
    }

    @PUT
    
    @Consumes({ "application/json" })
    
    @io.swagger.annotations.ApiOperation(value = "Update an existing destination", notes = "", response = Void.class, tags={ "Destination", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Destination not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    public Response updateDestination(@ApiParam(value = "Destination object that needs to be added to the store" ,required=true) DestinationItem body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateDestination(body,securityContext);
    }

}

