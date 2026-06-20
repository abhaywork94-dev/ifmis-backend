package com.ifmis.service;

import com.ifmis.dto.NotificationResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class NotificationService {

    public List<NotificationResponse> getNotifications() {

        return Arrays.asList(

                new NotificationResponse(
                        1L,
                        "Sanction Approved",
                        "Sanction SAN/2026/001 has been approved.",
                        false
                ),

                new NotificationResponse(
                        2L,
                        "Pending Approval",
                        "Sanction SAN/2026/005 is awaiting approval.",
                        true
                )

        );
    }
}