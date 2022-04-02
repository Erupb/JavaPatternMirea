package com.example.task14;

public class Card {
    private int cardNumber;
    private int code;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }



    @Override
    public String toString() {
        return "Card{" +
                "card Number='" + cardNumber + '\'' +
                ", card code='" + code + '\'' +'}';
    }

    public Card(int cardNumber, int code) {
        this.cardNumber = cardNumber;
        this.code = code;
    }
}
