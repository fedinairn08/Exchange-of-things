package com.project.exchangeOfThings.service;

import com.project.exchangeOfThings.dto.ThingDTO;
import com.project.exchangeOfThings.enums.ThingStatus;
import com.project.exchangeOfThings.evtity.Thing;
import com.project.exchangeOfThings.repository.ThingRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ThingService {
    private final ThingRepository thingRepository;
    private final ModelMapper modelMapper;

    public void saveThing(ThingDTO thingDTO) {
        thingDTO.setThingStatus(ThingStatus.NOT_EXPOSED);
        thingDTO.setNumberOfViews(0);
        thingRepository.save(modelMapper.map(thingDTO, Thing.class));
    }

}
