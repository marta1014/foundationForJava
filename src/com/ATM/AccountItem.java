package com.ATM;

public class AccountItem {
    private String cardId;
    private String userName;
    private String password;
    private double money;
    private double quotaMoney;

    public AccountItem() {}

    public AccountItem(String cardId, String userName, String password, double money, double quotaMoney) {
        this.cardId = cardId;
        this.userName = userName;
        this.password = password;
        this.money = money;
        this.quotaMoney = quotaMoney;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
