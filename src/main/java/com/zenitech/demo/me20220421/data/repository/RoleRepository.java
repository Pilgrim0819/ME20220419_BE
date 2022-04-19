package com.zenitech.demo.me20220421.data.repository;

import com.zenitech.demo.me20220421.data.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    List<Role> findRoleByUserId(Integer userId);

}
