package com.example.diary.controllers;

import com.example.diary.entities.UserEntity;
import com.example.diary.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String login() {

        return "user/login";
    }

    @PostMapping("/login")
    public String loginProc(UserEntity userEntity) {

        return "user/login";
    }


    @GetMapping("/join")
    public String join() {

        System.out.println(userService.selectUserList());

        return "user/join";
    }
    
    @PostMapping("/join")
    public String joinProc(UserEntity userEntity) {
        userService.joinUser(userEntity);
        System.out.println(userEntity);
        return "redirect:/user/login";
    }


    @GetMapping("/profile")
    public String profile() {

        return "user/profile";
    }

    @GetMapping("/editProfile")
    public String editProfile() {

        return "user/editProfile";
}
