package com.adrilopmar.projectsAPI.dto;

import jakarta.validation.constraints.NotNull;

public class AdminDto {

    @NotNull
    private String name;
    @NotNull
    private String password;
    @NotNull
    private String username;

    public AdminDto() {
    }

    public AdminDto(String name, String password, String username) {
        this.name = name;
        this.password = password;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }
    public void setUserName(String username) {
        this.username = username;
    }
}