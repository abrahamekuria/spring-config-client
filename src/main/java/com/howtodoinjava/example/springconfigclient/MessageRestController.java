package com.howtodoinjava.example.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ConfigurationProperties(prefix = "bootstrap.properties")
class MessageRestController {

    //There will be  a problem and the below will print when I just changed the msg to msgs in  https://github.com/HenokZewdie/employee-config-server/blob/master/application.properties
    @Value("${msg}")
    private String msg;

    @RequestMapping("/msg")
    String getMsg() {
        return this.msg;
    }
}