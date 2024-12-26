package com.wecp.progressive.entity;

public class User {
    private int userId;
    private String fullName;
    private String userName;
    private String passWord;
    private String email;
    private String role;

    
    public User() {
    }
    public User(int userId, String fullName, String userName, String passWord, String email, String role) {
        this.userId = userId;
        this.fullName = fullName;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.role = role;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    

}