package com.github.karolhor.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExampleController {
    private final Logger logger = LoggerFactory.getLogger(ExampleController.class);

    @GetMapping("/example")
    Mono<Map<String, String>> exampleEndpoint() {
        logger.trace("Example endpoint log works");
        return Mono.just(Map.of("status", "ok"));
    }
}
