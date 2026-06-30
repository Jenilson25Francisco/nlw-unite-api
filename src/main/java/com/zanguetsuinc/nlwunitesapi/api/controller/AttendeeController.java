package com.zanguetsuinc.nlwunitesapi.api.controller;

import com.zanguetsuinc.nlwunitesapi.api.assembler.AttendeeAssembler;
import com.zanguetsuinc.nlwunitesapi.api.dto.AttendeeDto;
import com.zanguetsuinc.nlwunitesapi.api.request.AttendeeRequest;
import com.zanguetsuinc.nlwunitesapi.domain.model.Attendee;
import com.zanguetsuinc.nlwunitesapi.domain.repository.AttendeeRepository;
import com.zanguetsuinc.nlwunitesapi.domain.service.AttendeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/attendees")
@RequiredArgsConstructor
public class AttendeeController {

    private final AttendeeRepository attendeeRepository;
    private final AttendeeAssembler attendeeAssembler;
    private final AttendeeService attendeeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AttendeeDto createAttendee(@RequestBody AttendeeRequest attendeeRequest){

        Attendee newAttendee = attendeeAssembler.toRequest(attendeeRequest);
        Attendee savedAttendee = attendeeService.create(newAttendee);

        return attendeeAssembler.toDto(savedAttendee);

    }

    @GetMapping
    public Page<Attendee> listAll(Pageable pageable){
        return attendeeRepository.findAll(pageable);
    }

}
