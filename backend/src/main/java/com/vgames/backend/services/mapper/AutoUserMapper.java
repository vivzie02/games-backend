package com.vgames.backend.services.mapper;

import com.vgames.backend.models.User;
import com.vgames.backend.persistence.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {
    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    User mapToUser(UserEntity userEntity);

    UserEntity mapToUserEntity(User user);
}
