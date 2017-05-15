package com.davidrus.freeparking.parking.rest;

import com.davidrus.freeparking.parking.dto.Parking;
import com.davidrus.freeparking.parking.services.ParkingServicesImpl;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by david on 12-May-17.
 */
@Path(RestConstants.PARKING_PATH)
@Controller
@Slf4j
public class ParkingResource {
    @Resource
    private ParkingServicesImpl parkingService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateParkingSpaces(Parking parking) {

        if (parking == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        if (!parkingService.updateParking(parking)) {
            return Response.accepted().build();
        }

        return Response
                .ok()
                .build();
    }

    @GET
    @Path("{parkingName}")
    public Response getNumberOfFreeParkingSpaces(@PathParam("parkingName") String parkingName) {

        int numberOfFreeSpaces = parkingService.getNumberOfFreeParkingSpaces(parkingName);
        return Response.ok().entity(numberOfFreeSpaces).build();

    }

}
