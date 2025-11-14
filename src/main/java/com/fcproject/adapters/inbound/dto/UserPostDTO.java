package com.fcproject.adapters.inbound.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fcproject.domain.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPostDTO {

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    private String email;

    private String phone;

    private Gender gender;

    @JsonProperty("date_of_birth")
    private LocalDate dateOfBirth;

    private String password;


}