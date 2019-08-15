package com.ng5.cloudnocasdiscovery;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudNocasDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudNocasDiscoveryApplication.class, args);
    }

    @RestController
    class EchoController {

        @Value("${server.port}")
        private String port;

        @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
        public String echo(@PathVariable String string) {
            return "Hello This is  Nacos Provider Discovery from port:"+port +" Cumtomer param :"+ string;
        }
    }
}
