package com.solid.domain.services;

import com.solid.domain.interfaces.Notifier;
import com.solid.domain.models.User;
import org.springframework.stereotype.Component;

@Component
public class EmailNotifierService implements Notifier {
    @Override
    public String notify(User user) {
       return  "Enviando email para " + user.getEmail();
    }
}
