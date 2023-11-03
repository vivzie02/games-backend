package com.vgames.backend.services.impl;

import com.vgames.backend.controllers.responses.UserResponse;
import com.vgames.backend.models.User;
import com.vgames.backend.persistence.repositories.UserRepository;
import com.vgames.backend.services.UserService;
import com.vgames.backend.services.mapper.AutoUserMapper;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean createUser(User user){
        try{
            userRepository.save(AutoUserMapper.MAPPER.mapToUserEntity(user));
            return true;
        }
        catch (Exception exception){
            logger.error(exception);
            return false;
        }
    }

    @Override
    public UserResponse createUserResponse(boolean success){
        UserResponse response;
        if(success){
            response = UserResponse.builder()
                    .responseText("User created successfully")
                    .token(getToken())
                    .build();
        }
        else{
            response = UserResponse.builder()
                    .responseText("User creation failed")
                    .token("")
                    .build();
        }
        return response;
    }

    public String getToken(){
        return "TestToken";
    }
}
