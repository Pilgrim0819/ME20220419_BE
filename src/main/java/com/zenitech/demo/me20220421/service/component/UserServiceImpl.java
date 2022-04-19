package com.zenitech.demo.me20220421.service.component;

import com.zenitech.demo.me20220421.data.entity.User;
import com.zenitech.demo.me20220421.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserByTerm(String term) {
        return null;
    }
}
