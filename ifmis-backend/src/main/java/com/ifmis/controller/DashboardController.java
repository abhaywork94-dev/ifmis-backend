package com.ifmis.controller;

import com.ifmis.dto.DashboardDetailsResponse;
import com.ifmis.dto.DashboardSummaryResponse;
import com.ifmis.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/summary")
    public DashboardSummaryResponse getDashboardSummary() {

        return dashboardService.getDashboardSummary();
    }
    @GetMapping("/details")
    public DashboardDetailsResponse getDashboardDetails() {

    return dashboardService.getDashboardDetails();
    }

}