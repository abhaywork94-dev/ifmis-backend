package com.ifmis.controller;

import com.ifmis.dto.NotificationResponse;
import com.ifmis.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping
    public List<NotificationResponse> getNotifications() {

        return notificationService.getNotifications();
    }
}