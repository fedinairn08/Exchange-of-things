package com.project.exchangeOfThings.utils;

import com.project.exchangeOfThings.dto.ThingDTO;
import com.project.exchangeOfThings.dto.UserDTO;
import com.project.exchangeOfThings.enums.ThingStatus;
import com.project.exchangeOfThings.evtity.Thing;
import com.project.exchangeOfThings.evtity.User;

public class DataMapper {
    public static User toUser(UserDTO userDTO) {
        return new User(userDTO.getId(),
                        userDTO.getName(),
                        userDTO.getSurname(),
                        userDTO.getLogin(),
                        userDTO.getPassword());
    }

    public static Thing toThing(ThingDTO thingDTO) {
        return new Thing(thingDTO.getId(),
                ThingStatus.valueOf(String.valueOf(thingDTO.getThingStatus())),
                thingDTO.getName(),
                thingDTO.getDescription(),
                thingDTO.getLinkToPhoto(),
                thingDTO.getNumberOfViews());
    }
}
