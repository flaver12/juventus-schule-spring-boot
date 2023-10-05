package ch.juventus.boothelloworld.service

import ch.juventus.boothelloworld.model.Order
import ch.juventus.boothelloworld.persistance.Database
import org.springframework.stereotype.Service

@Service
class OrderService(private val database: Database) {

    fun loadOrder(id: Int): Order? {
        return database.getOrder(id);
    }

    fun addOrder(id: Int, name: String): Order {
        return database.addOrder(id,name);
    }

    fun loadOrder(): MutableSet<Order> {
        return database.getOrder();
    }
}