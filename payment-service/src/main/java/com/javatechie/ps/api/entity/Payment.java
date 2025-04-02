package com.javatechie.ps.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Entity
@Table(name = "PAYMENT_TB")
public class Payment {

    @Id
    @GeneratedValue
    private int paymentId;
    private String paymentStatus;
    private String transactionId;
    private int orderId;
    private double amount;

    public Payment() {
    }

    public Payment(int paymentId, String paymentStatus, String transactionId, int orderId, int amount) {
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
        this.transactionId = transactionId;
        this.orderId = orderId;
        this.amount = amount;
    }

    public Payment(int paymentId, String paymentStatus, String transactionId) {
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
        this.transactionId = transactionId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentStatus='" + paymentStatus + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", orderId=" + orderId +
                ", amount=" + amount +
                '}';
    }
}
