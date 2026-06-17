package com.fitness.userservice.dto;
import lombok.Data;


import java.time.LocalDateTime;

@Data
public class UserResponse {

    private String id;
    private String password;
    private String email ;
    private String lastName;
    private String firstName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
