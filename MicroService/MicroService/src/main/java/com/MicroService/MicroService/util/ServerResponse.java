package com.MicroService.MicroService.util;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServerResponse {
    private String message;
    private String statusCode;
}
