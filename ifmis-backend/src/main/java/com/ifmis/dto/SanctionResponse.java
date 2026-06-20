package com.ifmis.dto;

public class SanctionResponse {

    private Long sanctionId;
    private String sanctionNumber;
    private String department;
    private Double amount;
    private String status;

    public SanctionResponse() {
    }

    public SanctionResponse(Long sanctionId,
                            String sanctionNumber,
                            String department,
                            Double amount,
                            String status) {
        this.sanctionId = sanctionId;
        this.sanctionNumber = sanctionNumber;
        this.department = department;
        this.amount = amount;
        this.status = status;
    }

    public Long getSanctionId() {
        return sanctionId;
    }

    public void setSanctionId(Long sanctionId) {
        this.sanctionId = sanctionId;
    }

    public String getSanctionNumber() {
        return sanctionNumber;
    }

    public void setSanctionNumber(String sanctionNumber) {
        this.sanctionNumber = sanctionNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}