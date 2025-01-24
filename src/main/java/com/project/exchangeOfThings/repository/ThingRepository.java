package com.project.exchangeOfThings.repository;

import com.project.exchangeOfThings.evtity.Thing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThingRepository extends JpaRepository<Thing, Long> {
}
