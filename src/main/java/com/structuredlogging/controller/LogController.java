package com.structuredlogging.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@Slf4j
public class LogController {

    @GetMapping(value = "/hello")
    public ResponseEntity<String> hello() {
        log.error("Hello: " + Arrays.toString(new NullPointerException().getStackTrace()));
        log.info("Hello");
        log.debug("Hello");
        log.warn("Hello");
        log.trace("Hello");
        return ResponseEntity.ok("hello");
    }

}
