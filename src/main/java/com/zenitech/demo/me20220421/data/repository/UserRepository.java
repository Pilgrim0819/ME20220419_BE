package com.zenitech.demo.me20220421.data.repository;

import com.zenitech.demo.me20220421.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findUserByRoleId(Integer roleId);

}
