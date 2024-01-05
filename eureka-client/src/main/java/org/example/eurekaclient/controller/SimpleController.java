package org.example.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple")
public class SimpleController {

    @Value("${eureka.instance.instance-id}")
    private String instanceID;

    @GetMapping("/test")
    public String test() {
        return "test (instance-id: '" + instanceID + "')";
    }
}
