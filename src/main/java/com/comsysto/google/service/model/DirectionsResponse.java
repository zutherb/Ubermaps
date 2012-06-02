package com.comsysto.google.service.model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;
import java.util.List;

/**
 * @author zutherb
 */
@JsonSerialize
public class DirectionsResponse implements Serializable {
    private DirectionsResponseStatus status;
    private List<Route> routes;

    public DirectionsResponseStatus getStatus() {
        return status;
    }

    public void setStatus(DirectionsResponseStatus status) {
        this.status = status;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }
}
