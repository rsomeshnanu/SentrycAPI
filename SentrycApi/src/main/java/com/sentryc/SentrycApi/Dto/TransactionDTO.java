package com.sentryc.SentrycApi.Dto;

public class TransactionDTO {
    private String type;
    private Double amount;
    private String currency;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getCurrency() {
        return currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
