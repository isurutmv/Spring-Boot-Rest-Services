package com.example.demospringlearn01.repositary;

import com.example.demospringlearn01.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostery extends JpaRepository<UserEntity,Integer> {
}
