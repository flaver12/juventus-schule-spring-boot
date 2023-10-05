package ch.juventus.boothelloworld.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    fun greeting(@RequestParam(value = "name", defaultValue = "foo") name: String): String {
        return "Hello World " + name
    }
}
