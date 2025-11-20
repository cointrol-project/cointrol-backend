package com.fcproject.adapters.outbound.entities.users;


import java.time.LocalDate;
import java.util.UUID;

import com.fcproject.application.core.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "acess", name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name="first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name="last_name", nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, unique = true, length = 250)
    private String email;

    @Column(name="phone_number", length = 20)
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private Gender gender;

    @Column(name="date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "password")
    private String password_hash;

    @Column(name = "created_at")
    private LocalDate created_at;

    @Column(name = "update_at")
    private LocalDate update_at;

    public UserEntity(UUID id, String firstName, String lastName, String email, String phone, Gender gender, LocalDate dateOfBirth, String password_hash) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.password_hash = password_hash;
    }
}
