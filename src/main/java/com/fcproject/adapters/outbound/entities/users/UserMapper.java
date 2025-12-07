package com.fcproject.adapters.outbound.entities.users;

import com.fcproject.application.core.domain.users.UserDomain;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {

    public UserDomain toDomain(UserEntity entity) {
        if (entity == null) {
            return null;
        }

        return new UserDomain(
                entity.getId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getEmail(),
                entity.getPassword_hash(),
                entity.getPhone(),
                entity.getGender(),
                entity.getDateOfBirth()
        );
    }

//    public UserEntity toEntity(UserDomain domain) {
//        if (domain == null) {
//            return null;
//        }
//
//        return new UserEntity(
//                domain.getId(),
//                domain.getFirstName(),
//                domain.getLastName(),
//                domain.getEmail(),
//                domain.getPhone(),
//                domain.getGender(),
//                domain.getDateOfBirth(),
//                domain.getPassword()
//        );
//    }
}
