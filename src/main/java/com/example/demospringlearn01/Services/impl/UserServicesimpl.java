package com.example.demospringlearn01.Services.impl;

import com.example.demospringlearn01.Services.UserServices;
import com.example.demospringlearn01.entity.UserEntity;
import com.example.demospringlearn01.repositary.UserRepostery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicesimpl implements UserServices {

    @Autowired
    private UserRepostery userRepostery;

    @Override
    public List<UserEntity> findAllUsers() {
        List<UserEntity> allusers = userRepostery.findAll();

        return allusers;
    }

    @Override
    public String updateuser(UserEntity userEntity) {
        String msg="";
        if(userEntity.getId() !=null){
            msg="Sucessfully updated";
            userRepostery.save(userEntity);
        }
        else
        {
            msg="No User found";
        }

        return msg;
    }

    @Override
    public String adduser(UserEntity userEntity) {

        userRepostery.save(userEntity);
        return "Sucess";
    }

    @Override
    public String deleteuser(UserEntity userEntity) {
        userRepostery.delete(userEntity);
        return "Sucess";
    }

    @Override
    public Optional<UserEntity> finduser(Integer id) {
        return userRepostery.findById(id);
    }
}
