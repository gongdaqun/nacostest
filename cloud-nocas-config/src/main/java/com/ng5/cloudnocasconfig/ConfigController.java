package com.ng5.cloudnocasconfig;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daqun.gong
 * @version 1.0
 * @date 2019/8/14
 */
@RestController
@RequestMapping("config")
@RefreshScope
public class ConfigController {

    @Value("${name:testLocal}")
    private String name;

    @GetMapping("/get")
    public String get() {
        return name;
    }
}
