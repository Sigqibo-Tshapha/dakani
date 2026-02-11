package com.logitech.domain.shipment;

public enum OrderState {
    RECEIVED(1, "Order received"),
    FACTORY(2, "Order packaging in progress"),
    READY(3, "Order ready for pick up"),
    TRANSIT(4, "Order in transit"),
    DE(5, "Order delivered");

    private int id;
    private String stage;

    OrderState(int id, String stage) {
        this.id = id;
        this.stage = stage;
    }
}
