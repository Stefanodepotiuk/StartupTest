package com.example.startuptest.services;

import com.example.startuptest.dao.UserDAO;
import com.example.startuptest.models.dto.UserDTO;
import com.example.startuptest.models.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserDAO userDAO;

    public UserDTO getById(Long id) {
        User footballer = userDAO.findById(id)
                .orElseThrow(() -> new NullPointerException("This User isn't exist"));
        return new UserDTO(footballer);
    }
}
