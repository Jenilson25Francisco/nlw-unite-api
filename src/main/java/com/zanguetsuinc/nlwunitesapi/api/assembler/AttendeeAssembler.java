package com.zanguetsuinc.nlwunitesapi.api.assembler;

import com.zanguetsuinc.nlwunitesapi.api.dto.AttendeeDto;
import com.zanguetsuinc.nlwunitesapi.api.request.AttendeeRequest;
import com.zanguetsuinc.nlwunitesapi.domain.model.Attendee;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AttendeeAssembler {

    private final ModelMapper modelMapper;

    public AttendeeDto toDto(Attendee attendee) {
        return modelMapper.map(attendee, AttendeeDto.class);
    }

    public List<AttendeeDto> toCollectionModel(List<Attendee> attendees){
        return attendees.stream()
                .map(this::toDto)
                .toList();
    }

    public Attendee toRequest(AttendeeRequest attendeeRequest){
        return modelMapper.map(attendeeRequest, Attendee.class);
    }
}
