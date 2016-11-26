package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jan on 2016/11/25.
 */
@Controller
public class DemoController {
    public static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/demo")
    public String demo() {
        log.info("request path: /demo");
        return "demo";
    }
}
