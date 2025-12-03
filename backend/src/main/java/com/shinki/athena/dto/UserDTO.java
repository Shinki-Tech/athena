package com.shinki.athena.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserDTO(
        @NotBlank(message = "The name is required")
        String name,
        @NotBlank(message = "The email is required")
        @Email(message = "The email format is invalid")
        String email,
        @NotBlank(message = "The password is required")
        String password) {
}
