package com.ifmis.dto;

public class DashboardSummaryResponse {

    private int totalSanctions;
    private int approvedSanctions;
    private int pendingSanctions;
    private int rejectedSanctions;

    public DashboardSummaryResponse() {
    }

    public DashboardSummaryResponse(int totalSanctions,
                                    int approvedSanctions,
                                    int pendingSanctions,
                                    int rejectedSanctions) {
        this.totalSanctions = totalSanctions;
        this.approvedSanctions = approvedSanctions;
        this.pendingSanctions = pendingSanctions;
        this.rejectedSanctions = rejectedSanctions;
    }

    public int getTotalSanctions() {
        return totalSanctions;
    }

    public void setTotalSanctions(int totalSanctions) {
        this.totalSanctions = totalSanctions;
    }

    public int getApprovedSanctions() {
        return approvedSanctions;
    }

    public void setApprovedSanctions(int approvedSanctions) {
        this.approvedSanctions = approvedSanctions;
    }

    public int getPendingSanctions() {
        return pendingSanctions;
    }

    public void setPendingSanctions(int pendingSanctions) {
        this.pendingSanctions = pendingSanctions;
    }

    public int getRejectedSanctions() {
        return rejectedSanctions;
    }

    public void setRejectedSanctions(int rejectedSanctions) {
        this.rejectedSanctions = rejectedSanctions;
    }
}