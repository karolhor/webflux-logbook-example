package com.github.karolhor.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExampleController {

    @GetMapping("/example")
    Mono<Map<String, String>> exampleEndpoint() {
        return Mono.just(Map.of("status", "ok"));
    }
}
