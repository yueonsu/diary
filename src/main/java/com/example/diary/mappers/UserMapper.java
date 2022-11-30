package com.example.diary.mappers;

import com.example.diary.entities.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserEntity> selectUserList();
    boolean joinUser(UserEntity userEntity);
    UserEntity loginUser(UserEntity entity);
}
