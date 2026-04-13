package com.zanguetsuinc.nlwunitesapi.api.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AttendeeRequest {

    private String nome;
    private String email;

}
