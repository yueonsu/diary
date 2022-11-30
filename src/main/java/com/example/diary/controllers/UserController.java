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

    @GetMapping("/join")
    public String join() {


        return "user/join";
    }

    @PostMapping("/join")
    public String joinProc(UserEntity userEntity) {
        System.out.println(userService.joinUser(userEntity));

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
}
