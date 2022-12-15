package com.example.startuptest.services;

import com.example.startuptest.dao.UserDAO;
import com.example.startuptest.models.dto.UserDTO;
import com.example.startuptest.models.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    UserDAO userDAO;
    @InjectMocks
    UserService userService;
    @Test
    void getById() {
        User user = new User(1L,"Stepan", LocalDate.parse("1998-02-27"));
        UserDTO expected = new UserDTO(1L,"Stepan", LocalDate.parse("1998-02-27"));

        when(userDAO.findById(1L)).thenReturn(Optional.of(user));
        UserDTO result = userService.getById(1L);

        assertEquals(expected,result);
    }
}