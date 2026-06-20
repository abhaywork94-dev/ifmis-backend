package com.ifmis.controller;

import com.ifmis.dto.SanctionResponse;
import com.ifmis.service.SanctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sanctions")
public class SanctionController {

    @Autowired
    private SanctionService sanctionService;

    @GetMapping("/recent")
    public List<SanctionResponse> getRecentSanctions() {
        return sanctionService.getRecentSanctions();
    }

    @GetMapping("/pending")
    public List<SanctionResponse> getPendingSanctions() {
        return sanctionService.getPendingSanctions();
    }
    @GetMapping("/{sanctionId}")
public SanctionResponse getSanctionById(
        @PathVariable Long sanctionId) {

    return sanctionService.getSanctionById(sanctionId);
}
}