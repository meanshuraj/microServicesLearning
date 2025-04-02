package com.javatechie.os.api.common;

import com.javatechie.os.api.entity.Order;

public class TransactionResponse {
    private Order order;
    private double amount;
    private String transactionId;
    private String messaage;

    public TransactionResponse(Order order, double amount, String transactionId, String messaage) {
        this.order = order;
        this.amount = amount;
        this.transactionId = transactionId;
        this.messaage = messaage;
    }

    public TransactionResponse() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getMessaage() {
        return messaage;
    }

    public void setMessaage(String messaage) {
        this.messaage = messaage;
    }

    @Override
    public String toString() {
        return "TransactionResponse{" +
                "order=" + order +
                ", amount=" + amount +
                ", transactionId='" + transactionId + '\'' +
                ", messaage='" + messaage + '\'' +
                '}';
    }
}
