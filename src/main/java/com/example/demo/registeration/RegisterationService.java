package com.example.demo.registeration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegisterationService {
    private EmailValidator emailValidator;
    public String register(RegisterationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(!isValidEmail)
            throw new IllegalStateException("Invalid email id");
        return "Works";
    }
}
