package com.ifmis.service;

import com.ifmis.dto.SanctionResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SanctionService {

    public List<SanctionResponse> getRecentSanctions() {

        return Arrays.asList(
                new SanctionResponse(
                        1001L,
                        "SAN/2026/001",
                        "Finance Department",
                        2500000.0,
                        "Approved"
                ),

                new SanctionResponse(
                        1002L,
                        "SAN/2026/002",
                        "Education Department",
                        1500000.0,
                        "Pending"
                ),

                new SanctionResponse(
                        1003L,
                        "SAN/2026/003",
                        "Health Department",
                        3500000.0,
                        "Approved"
                )
        );
    }

    public List<SanctionResponse> getPendingSanctions() {

        return Arrays.asList(
                new SanctionResponse(
                        1002L,
                        "SAN/2026/002",
                        "Education Department",
                        1500000.0,
                        "Pending"
                ),

                new SanctionResponse(
                        1005L,
                        "SAN/2026/005",
                        "Revenue Department",
                        5000000.0,
                        "Pending"
                )
        );
    }

    public SanctionResponse getSanctionById(Long sanctionId) {

        return new SanctionResponse(
                sanctionId,
                "SAN/2026/00" + sanctionId,
                "Finance Department",
                2500000.0,
                "Approved"
        );
    }
}