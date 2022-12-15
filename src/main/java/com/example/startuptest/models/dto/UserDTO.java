package com.example.startuptest.models.dto;

import com.example.startuptest.models.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String name;
    private LocalDate dateBirth;

    public UserDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.dateBirth = user.getDateBirth();
    }
}
