package com.example.startuptest.conrollers;

import com.example.startuptest.models.dto.UserDTO;
import com.example.startuptest.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findByIdUser(@PathVariable Long id) {
        if (userService.getById(id) == null || id <= 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userService.getById(id), HttpStatus.OK);
    }
}
