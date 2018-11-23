package io.swagger.api.factories;

import io.swagger.api.DestinationApiService;
import io.swagger.api.impl.DestinationApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-23T15:16:48.319Z[GMT]")
public class DestinationApiServiceFactory {
    private final static DestinationApiService service = new DestinationApiServiceImpl();

    public static DestinationApiService getDestinationApi() {
        return service;
    }
}
