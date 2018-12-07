package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.DestinationItem;


import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import javax.validation.constraints.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T15:16:48.319Z[GMT]")

public class DestinationApiServiceImpl extends DestinationApiService {
    
    List<DestinationItem> destination_list = new ArrayList<DestinationItem>();
    
    @Override
    public Response adddestination(DestinationItem body, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        DestinationItem destination_item = new DestinationItem();
        destination_item.setDenomination(body.getDenomination());
        destination_item.setIdDestination(body.getIdDestination());
        destination_item.setXCoordinate(body.getXCoordinate());
        destination_item.setYCoordinate(body.getYCoordinate());
        destination_list.add(destination_item);
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Destination added!")).build();
    }
    
    @Override
    public Response deleteDestination(Long destinationId, String apiKey, SecurityContext securityContext) throws NotFoundException {
        for(int index=0;index<destination_list.size();index++){
            if(destination_list.get(index).getIdDestination().equals(destinationId)){
                destination_list.remove(index);
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "Destination deleted!")).build();
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "Destination not found!")).build();
    }
    
    @Override
    public Response getDestinationById(Long destinationId, SecurityContext securityContext) throws NotFoundException {
        for(int index=0;index<destination_list.size();index++){
            if(destination_list.get(index).getIdDestination().equals(destinationId)){
                DestinationItem destination_found = destination_list.get(index);
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, destination_found.toString())).build();
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "Destination not found!")).build();
    }
    
    @Override
    public Response getalldestinations(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        //return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, destination_list.toString())).build();
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "DN,SA,GD,SA,GI,SA,GC,SA,GD,SA,GI,SA,DST")).build();
    }
    
    @Override
    public Response updateDestination(DestinationItem body, SecurityContext securityContext) throws NotFoundException {
        for(int index=0;index<destination_list.size();index++){
            if(destination_list.get(index).getIdDestination().equals(body.getIdDestination())){
                destination_list.get(index).setDenomination(body.getDenomination());
                destination_list.get(index).setIdDestination(body.getIdDestination());
                destination_list.get(index).setXCoordinate(body.getXCoordinate());
                destination_list.get(index).setYCoordinate(body.getYCoordinate());
                return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, destination_list.get(index).toString())).build();
            }
        }
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.ERROR, "Destination not found!")).build();
    }
    
}

