package com.solid.controllers;

import com.solid.domain.models.User;
import com.solid.domain.services.UserNotificationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserNotificationService notificationService;

    public UserController(UserNotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/notify")
    public String notifyUser(@RequestBody User user) {
        return notificationService.notifyUser(user);
    }
}
