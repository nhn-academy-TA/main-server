package com.project.babchu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class TestController {

    @GetMapping("/")
    public String test() {
        log.info("CI/CD 테스트");
        return "test";
    }
}
