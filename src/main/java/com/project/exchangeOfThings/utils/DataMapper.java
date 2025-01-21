package com.project.exchangeOfThings.utils;

import com.project.exchangeOfThings.dto.UserDTO;
import com.project.exchangeOfThings.evtity.User;

public class DataMapper {
    public static User toUser(UserDTO userDTO) {
        return new User(userDTO.getId(),
                        userDTO.getName(),
                        userDTO.getSurname(),
                        userDTO.getLogin(),
                        userDTO.getPassword());
    }
}
