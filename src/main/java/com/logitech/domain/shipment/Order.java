package com.logitech.domain.shipment;

import com.logitech.domain.product.Product;
import com.logitech.domain.vehicle.Vehicle;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    protected Vehicle vehicle = null;

    @OneToMany
    @JoinColumn(name = "product_id")
    protected List<Product> products = new ArrayList<>();

    protected LocalDateTime orderDate;
    protected LocalDateTime arrivalTime;

    @Enumerated
    protected OrderState state;


    public Order() {}

    public String getId() {
        return id;
    }


    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setState(OrderState state) {
        this.state = state;
    }
}
