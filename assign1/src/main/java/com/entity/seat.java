package com.entity;

public class seat {

    private int seatId;

    private int isOrder;

    private int price;

    public seat(){}

    public seat(int seatId, int isOrder, int price) {
        this.seatId = seatId;
        this.isOrder = isOrder;
        this.price = price;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getIsOrder() {
        return isOrder;
    }

    public void setIsOrder(int isOrder) {
        this.isOrder = isOrder;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "seat{" +
                "seatId=" + seatId +
                ", isOrder=" + isOrder +
                ", price=" + price +
                '}';
    }
}
