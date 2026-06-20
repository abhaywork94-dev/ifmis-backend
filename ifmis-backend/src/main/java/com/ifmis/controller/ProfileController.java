package com.ifmis.controller;

import com.ifmis.dto.ProfileResponse;
import com.ifmis.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping
    public ProfileResponse getProfile() {

        return profileService.getProfile();
    }
}