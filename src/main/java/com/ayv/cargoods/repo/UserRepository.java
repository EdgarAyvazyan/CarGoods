package com.ayv.cargoods.repo;


import com.ayv.cargoods.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findUserByUsernameIgnoreCase(String username);
}
