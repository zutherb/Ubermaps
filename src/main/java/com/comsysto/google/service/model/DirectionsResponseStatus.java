package com.comsysto.google.service.model;

/**
 * @author zutherb
 */
public enum DirectionsResponseStatus {
    OK,                     //indicates the response contains a valid result
    NOT_FOUND,              //indicates at least one of the locations specified in the requests's origin, destination, or
                            //waypoints could not be geocoded
    ZERO_RESULTS,           //indicates no route could be found between the origin and destination.
    MAX_WAYPOINTS_EXCEEDED;
}
