package com.entity;

public class order_s {

    private int userId;

    private int seatId;

    private int price;

    private int isPay;

    public order_s(){}

    public order_s(int userId, int seatId, int price, int isPay) {
        this.userId = userId;
        this.seatId = seatId;
        this.price = price;
        this.isPay = isPay;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIsPay() {
        return isPay;
    }

    public void setIsPay(int isPay) {
        this.isPay = isPay;
    }

    @Override
    public String toString() {
        return "order_s{" +
                "userId=" + userId +
                ", seatId=" + seatId +
                ", price=" + price +
                ", isPay=" + isPay +
                '}';
    }
}
