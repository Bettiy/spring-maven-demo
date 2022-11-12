package com.betty.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
@Slf4j
public class HelloController {

    @GetMapping("world")
    public String hello() {
        log.info("hello my log");
        return "nihao, my mac";
    }

    @PostMapping("post-link")
    public void test() {

    }

}
