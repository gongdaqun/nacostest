package com.ng5.nocasdiscovery;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author daqun.gong
 * @version 1.0
 * @date 2019/8/14
 */
@Component
public class NacosInitRegister {

    @NacosInjected
    private NamingService namingService;

    @Value("${server.port}")
    private int serverPort;

    @Value("${spring.application.name}")
    private String applicationName;

//    @PostConstruct
//    public void registerInstance() throws NacosException {
//        namingService.registerInstance(applicationName,"127.0.0.1",serverPort);
//    }

}
