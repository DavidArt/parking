package com.davidrus.freeparking.parking;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * Spring configuration class. The project uses JavaConfig instead of XML based Spring configuration
 */

@Configuration
@ComponentScan(basePackageClasses = {ParkingScannable.class})
public class ParkingConfig {
    @Bean
    public Mapper mapper() {
        return new DozerBeanMapper();
    }

    @ConfigurationProperties(prefix = "datasource.mysql")
    @Bean
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .username("root")
                .password("david")
                .url("jdbc:mysql://localhost:3306/parkingdb")
                .driverClassName("com.mysql.jdbc.Driver")
                .build();
    }
}
