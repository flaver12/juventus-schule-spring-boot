package ch.juventus.boothelloworld.persistance

import ch.juventus.boothelloworld.model.Order
import org.springframework.stereotype.Repository

@Repository
class Database {
    private val orders: MutableSet<Order> = HashSet()

    fun getOrder(id: Int): Order? {
        return orders.find { order -> order.id == id }
    }

    fun addOrder(id: Int, name: String): Order {
        val order = Order(id, name);
        orders.add(order);
        return order;
    }

    fun getOrder(): MutableSet<Order> {
        return orders;
    }
}