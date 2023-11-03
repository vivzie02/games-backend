package com.vgames.backend.services.impl;

import com.vgames.backend.models.User;
import com.vgames.backend.persistence.repositories.UserRepository;
import com.vgames.backend.services.UserService;
import com.vgames.backend.services.mapper.AutoUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(User user){
        userRepository.save(AutoUserMapper.MAPPER.mapToUserEntity(user));
    }
}
