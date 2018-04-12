package com.example.demospringlearn01.Controllers;

import com.example.demospringlearn01.Services.UserServices;
import com.example.demospringlearn01.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class Users {

    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public List<UserEntity> getallusers(){

      return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String adduser(@RequestBody UserEntity userEntity){

        return userServices.adduser(userEntity);
    }

    @PutMapping("/update")
    public String updateuser(@RequestBody UserEntity userEntity){

        return userServices.updateuser(userEntity);
    }
    @DeleteMapping("/delete")
    public String deleteuser(@RequestBody UserEntity userEntity){

        return userServices.deleteuser(userEntity);
    }
    @GetMapping("/find/{id}")
    public Optional<UserEntity> finduser(@PathVariable Integer id)
    {
        return userServices.finduser(id);
    }
}
