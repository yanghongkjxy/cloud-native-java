package com.siemens.cms.turbine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * @author Michael Ji
 */
@SpringBootApplication
@EnableTurbineStream
@EnableDiscoveryClient
public class TurbineApplication {

    public static void main(String[] args) {
    	new SpringApplicationBuilder(TurbineApplication.class).web(true).run(args);
    }
}
