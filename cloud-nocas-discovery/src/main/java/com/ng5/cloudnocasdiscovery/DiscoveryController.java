package com.ng5.cloudnocasdiscovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author daqun.gong
 * @version 1.0
 * @date 2019/8/14
 */
@RestController
@RequestMapping("provider")
public class DiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string;
    }

    @GetMapping(value = "/get/{serviceName}")
    public List<ServiceInstance> getService(@PathVariable String serviceName) {
        return discoveryClient.getInstances(serviceName);
    }
}
