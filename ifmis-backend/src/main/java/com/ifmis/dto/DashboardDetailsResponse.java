package com.ifmis.dto;

import java.util.List;

public class DashboardDetailsResponse {

    private String userName;
    private String role;
    private int pendingCount;
    private int notificationCount;
    private List<SanctionResponse> recentSanctions;

    public DashboardDetailsResponse() {
    }

    public DashboardDetailsResponse(
            String userName,
            String role,
            int pendingCount,
            int notificationCount,
            List<SanctionResponse> recentSanctions) {

        this.userName = userName;
        this.role = role;
        this.pendingCount = pendingCount;
        this.notificationCount = notificationCount;
        this.recentSanctions = recentSanctions;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPendingCount() {
        return pendingCount;
    }

    public void setPendingCount(int pendingCount) {
        this.pendingCount = pendingCount;
    }

    public int getNotificationCount() {
        return notificationCount;
    }

    public void setNotificationCount(int notificationCount) {
        this.notificationCount = notificationCount;
    }

    public List<SanctionResponse> getRecentSanctions() {
        return recentSanctions;
    }

    public void setRecentSanctions(List<SanctionResponse> recentSanctions) {
        this.recentSanctions = recentSanctions;
    }
}