package com.example.test.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.SpringVersion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/monitoring")
public class SpringVersionActuator {

    @GetMapping("/springVersion")
    public Map<String, String> getSpringVersion() {
        Map<String, String> result = new HashMap<>();
        result.put("version", SpringVersion.getVersion());
        return result;
    }

}
