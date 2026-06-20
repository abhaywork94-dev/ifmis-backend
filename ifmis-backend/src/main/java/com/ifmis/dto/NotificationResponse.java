package com.ifmis.dto;

public class NotificationResponse {

    private Long notificationId;
    private String title;
    private String message;
    private boolean isRead;

    public NotificationResponse() {
    }

    public NotificationResponse(Long notificationId,
                                String title,
                                String message,
                                boolean isRead) {
        this.notificationId = notificationId;
        this.title = title;
        this.message = message;
        this.isRead = isRead;
    }

    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}