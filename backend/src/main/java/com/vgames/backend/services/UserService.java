package com.vgames.backend.services;

import com.vgames.backend.controllers.responses.UserResponse;
import com.vgames.backend.models.User;

public interface UserService {
    boolean createUser(User user);

    UserResponse createUserResponse(boolean success);
}
