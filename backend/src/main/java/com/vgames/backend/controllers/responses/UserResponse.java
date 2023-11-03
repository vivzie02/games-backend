package com.vgames.backend.controllers.responses;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserResponse {
    private String responseText;
    private String token;
}
