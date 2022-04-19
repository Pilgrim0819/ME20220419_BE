package com.zenitech.demo.me20220421.web.controller;

import com.zenitech.demo.me20220421.data.entity.User;
import com.zenitech.demo.me20220421.service.component.UserService;
import com.zenitech.demo.me20220421.web.dto.SearchRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public User getUserById(@RequestBody SearchRequestDTO dto) {
        return userService.getUserByTerm(dto.getTerm());
    }

}
