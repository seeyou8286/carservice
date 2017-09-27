package com.jiufeng.car.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Response {
    private String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorMessage;

    public Response(String status, String errorMessage) {
        this.status = status;
        this.errorMessage = errorMessage;
    }

    public Response() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
