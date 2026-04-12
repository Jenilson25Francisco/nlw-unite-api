package com.zanguetsuinc.nlwunitesapi.domain.repository;

import com.zanguetsuinc.nlwunitesapi.domain.model.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AttendeeRepository extends JpaRepository<Attendee, UUID> {
}
