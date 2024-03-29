package com.ng5.nocasconfig;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "springcloud-nacos-config", autoRefreshed = true)
public class NocasConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NocasConfigApplication.class, args);
    }

}
