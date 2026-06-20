package com.ifmis.service;

import com.ifmis.dto.ProfileResponse;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    public ProfileResponse getProfile() {

        return new ProfileResponse(
                1L,
                "admin",
                "Abhay Singh",
                "Finance Officer",
                "Finance Department",
                "Approver"
        );
    }
}