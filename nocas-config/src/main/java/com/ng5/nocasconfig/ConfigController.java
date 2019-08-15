package com.ng5.nocasconfig;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daqun.gong
 * @version 1.0
 * @date 2019/8/14
 */
@RestController
@RequestMapping("config")
public class ConfigController {

    @NacosValue(value = "${test.properties.useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    @GetMapping("/get")
    public boolean get() {
        return useLocalCache;
    }
}
