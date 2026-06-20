package com.ifmis.dto;

public class ProfileResponse {

    private Long userId;
    private String username;
    private String name;
    private String designation;
    private String department;
    private String role;

    public ProfileResponse() {
    }

    public ProfileResponse(Long userId,
                           String username,
                           String name,
                           String designation,
                           String department,
                           String role) {
        this.userId = userId;
        this.username = username;
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}