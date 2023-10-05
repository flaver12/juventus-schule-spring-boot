package ch.juventus.boothelloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BootHelloWorldApplication

fun main(args: Array<String>) {
	runApplication<BootHelloWorldApplication>(*args)
}
