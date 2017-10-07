package com.jiufeng.car.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Response {
    private String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String errorMessage;

    public Response(String status, String errorMessage) {
        this.status = status;
        this.errorMessage = errorMessage;
    }
}
