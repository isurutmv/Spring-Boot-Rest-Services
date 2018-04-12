package com.example.demospringlearn01.Services;


import com.example.demospringlearn01.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserServices {

    List<UserEntity> findAllUsers();

    String adduser(UserEntity userEntity);

    String updateuser(UserEntity userEntity);

    String deleteuser(UserEntity userEntity);

    Optional<UserEntity> finduser(Integer id);
}
