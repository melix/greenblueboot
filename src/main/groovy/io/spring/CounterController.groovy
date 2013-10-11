package io.spring

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import java.util.concurrent.atomic.AtomicInteger

@RestController
class CounterController {
    private final AtomicInteger counter = new AtomicInteger()
    @RequestMapping("/")
    String home() {
        "App v1. Request count: ${counter.incrementAndGet()}"
    }
}