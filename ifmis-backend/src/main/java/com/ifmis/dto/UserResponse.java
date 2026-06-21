package com.ifmis.dto;

public class UserResponse {

    private Long id;
    private String username;
    private String name;
    private String role;
    private String department;

    public UserResponse() {
    }

    public UserResponse(Long id,
                        String username,
                        String name,
                        String role,
                        String department) {

        this.id = id;
        this.username = username;
        this.name = name;
        this.role = role;
        this.department = department;
    }

    public Long getUserId() {
        return id;
    }

    public void setUserId(Long id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return username;
    }

    public void setEmployeeId(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}