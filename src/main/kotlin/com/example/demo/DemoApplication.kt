package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication()
@RestController
class DemoApplication {
    @GetMapping("/hello")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String): String {
        return String.format("ab %s", name)
    }
}

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
