package com.zanguetsuinc.nlwunitesapi.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
public class AttendeeDto {

    private UUID id;
    private String nome;
    private String email;
    private OffsetDateTime createdAt;
    private LocalDateTime checkedInAt;

}
