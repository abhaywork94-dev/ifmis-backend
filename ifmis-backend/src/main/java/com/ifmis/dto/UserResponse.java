package com.ifmis.dto;

public class UserResponse {

    private Long userId;
    private String employeeId;
    private String name;
    private String role;
    private String department;

    public UserResponse() {
    }

    public UserResponse(Long userId,
                        String employeeId,
                        String name,
                        String role,
                        String department) {

        this.userId = userId;
        this.employeeId = employeeId;
        this.name = name;
        this.role = role;
        this.department = department;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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