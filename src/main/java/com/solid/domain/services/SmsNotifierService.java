package com.solid.domain.services;

import com.solid.domain.interfaces.Notifier;
import com.solid.domain.models.User;
import org.springframework.stereotype.Component;

@Component
public class SmsNotifierService implements Notifier {
    @Override
    public String notify(User user) {
       return "Enviando SMS para " + user.getName();
    }
}
