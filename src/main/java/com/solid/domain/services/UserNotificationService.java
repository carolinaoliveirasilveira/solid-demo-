package com.solid.domain.services;

import com.solid.domain.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserNotificationService {

    private final SmsNotifierService smsNotifierService;
    private final EmailNotifierService emailNotifierService;

    public UserNotificationService(
            SmsNotifierService smsNotifierService,
            EmailNotifierService emailNotifierService) {
        this.smsNotifierService = smsNotifierService;
        this.emailNotifierService = emailNotifierService;
    }

    public String notifyUser(User user) {
        if (user.getSms() != null) {
            return smsNotifierService.notify(user);
        } else if (user.getEmail() != null) {
            return emailNotifierService.notify(user);
        } else {
            return "SMS ou E-mail precisam ser preenchidos!";

        }

    }
}
