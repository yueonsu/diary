package com.example.diary.config;

import com.example.diary.entities.UserEntity;
import com.example.diary.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DefaultUserDetailsService implements UserDetailsService {
    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        UserEntity entity = new UserEntity();
        entity.setUserId(userId);
        entity = userService.loginUser(entity);
        System.out.println(entity);

        if(entity == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new DefaultUserDetails(entity);
    }
}
