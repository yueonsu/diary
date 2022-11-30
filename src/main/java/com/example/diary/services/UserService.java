package com.example.diary.services;

import com.example.diary.entities.UserEntity;
import com.example.diary.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public List<UserEntity> selectUserList() {
        return userMapper.selectUserList();
    }

    void create(UserEntity user){ }
}
