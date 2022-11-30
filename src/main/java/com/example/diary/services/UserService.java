package com.example.diary.services;

import com.example.diary.entities.UserEntity;
import com.example.diary.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public List<UserEntity> selectUserList() {
        return userMapper.selectUserList();
    }

    public boolean joinUser(UserEntity userEntity) {
        userEntity.setUserPw(BCrypt.hashpw(userEntity.getUserPw(), BCrypt.gensalt()));
        return userMapper.joinUser(userEntity);
    }
    public UserEntity loginUser(UserEntity userEntity) {
        return userMapper.loginUser(userEntity);
    }
}
