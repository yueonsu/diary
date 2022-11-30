package com.example.diary.entities;

import lombok.Data;

@Data
public class UserEntity {
    private int userPk;
    private String nickname;
    private String gender;
    private String birth;
    private String region;
    private String userId;
    private String userPw;
    private String userEmail;
    private String regDate;
}
