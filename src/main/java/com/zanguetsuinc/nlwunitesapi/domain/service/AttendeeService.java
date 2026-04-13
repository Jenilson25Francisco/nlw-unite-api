package com.zanguetsuinc.nlwunitesapi.domain.service;

import com.zanguetsuinc.nlwunitesapi.domain.model.Attendee;
import com.zanguetsuinc.nlwunitesapi.domain.repository.AttendeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Service
@RequiredArgsConstructor
public class AttendeeService {

    private final AttendeeRepository attendeeRepository;

    public Attendee create(Attendee attendee){

        attendee.setCreatedAt(OffsetDateTime.now());
        attendee.setChackedInAt(LocalDateTime.now());

        return attendeeRepository.save(attendee);
    }

}
