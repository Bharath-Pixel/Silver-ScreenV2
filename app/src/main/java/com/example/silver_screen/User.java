package com.example.silver_screen;

public class User {

    private String uid;
    private String username;
    private String email;
    private String password;
    private String url;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String uid, String username, String email, String password, String url) {
        this.uid = uid;
        this.username = username;
        this.email = email;
        this.password = password;
        this.url = url;
    }

    // Getter methods
    public String getUid() {
        return uid;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    // Setter methods
    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
