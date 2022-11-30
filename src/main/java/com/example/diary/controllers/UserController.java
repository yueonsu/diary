package com.example.diary.controllers;

import com.example.diary.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/join")
    public String join() {

        System.out.println(userService.selectUserList());

        return "user/join";
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
