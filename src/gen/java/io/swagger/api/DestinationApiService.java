package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.DestinationItem;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T15:16:48.319Z[GMT]")

public abstract class DestinationApiService {
    
    public abstract Response adddestination(DestinationItem body,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response deleteDestination(Long destinationId,String apiKey,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getDestinationById(Long destinationId,SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response getalldestinations(SecurityContext securityContext) throws NotFoundException;
    
    public abstract Response updateDestination(DestinationItem body,SecurityContext securityContext) throws NotFoundException;
    
}

