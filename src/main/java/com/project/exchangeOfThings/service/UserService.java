package com.project.exchangeOfThings.service;

import com.project.exchangeOfThings.dto.UserDTO;
import com.project.exchangeOfThings.evtity.User;
import com.project.exchangeOfThings.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public void editUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        userRepository.save(user);
    }
}
