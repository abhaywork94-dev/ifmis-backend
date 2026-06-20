package com.ifmis.service;

import com.ifmis.dto.DashboardDetailsResponse;
import com.ifmis.dto.DashboardSummaryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    @Autowired
    private SanctionService sanctionService;

    public DashboardSummaryResponse getDashboardSummary() {

        return new DashboardSummaryResponse(
                125,
                90,
                30,
                5
        );
    }

    public DashboardDetailsResponse getDashboardDetails() {

        return new DashboardDetailsResponse(
                "Abhay Singh",
                "Approver",
                2,
                2,
                sanctionService.getRecentSanctions()
        );
    }
}