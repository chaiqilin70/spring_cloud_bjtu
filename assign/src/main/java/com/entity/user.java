package com.entity;

public class user {

    private String userId;

    private String userName;

    private String userPas;

    private String account;


    public user(){}

    public user(String userId, String userName, String userPas, String account) {
        this.userId = userId;
        this.userName = userName;
        this.userPas = userPas;
        this.account = account;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPas() {
        return userPas;
    }

    public void setUserPas(String userPas) {
        this.userPas = userPas;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "user{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userPas='" + userPas + '\'' +
                ", account='" + account + '\'' +
                '}';
    }
}
