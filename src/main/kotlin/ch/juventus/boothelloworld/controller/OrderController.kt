package ch.juventus.boothelloworld.controller

import ch.juventus.boothelloworld.model.Order
import ch.juventus.boothelloworld.service.OrderService
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController(private val orderService: OrderService) {

    @GetMapping("/order")
    fun index(): MutableSet<Order> {
        return orderService.loadOrder()
    }

    @PostMapping("/order")
    fun insert(@RequestBody order: Order): Order {
        return orderService.addOrder(order.id, order.name)
    }

    @Operation(summary = "Get a order by its id")
    @GetMapping("/order/{id}")
    fun find(@PathVariable id: Int): Order? {
        return orderService.loadOrder(id)
    }
}