package com.davidrus.freeparking.parking;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.stereotype.Component;

/**
 * Created by david on 15-May-17.
 */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("com.davidrus.freeparking.parking.rest");
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
    }
}
