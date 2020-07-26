package com.cheney.databindingsample.beans;

import androidx.databinding.ObservableField;

public class User {

    private ObservableField<String> username;

    private ObservableField<String> password;


    public User(String username, String password) {
        this.username = new ObservableField<>(username);
        this.password = new ObservableField<>(password);
    }

    public ObservableField<String> getUsername() {
        return username;
    }

    public void setUsername(ObservableField<String> username) {
        this.username = username;
    }

    public ObservableField<String> getPassword() {
        return password;
    }

    public void setPassword(ObservableField<String> password) {
        this.password = password;
    }
}
