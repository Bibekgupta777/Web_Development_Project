package com.spark.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {

    @GetMapping("/signup")
    public String showSignupForm() {
        return "signup"; // Return the name of the signup HTML page
    }

    @PostMapping("/signup")
    public String processSignupForm(/* Add parameters for form data */) {
        // Process signup form submission
        // Add logic to create a new user account
        return "redirect:/login"; // Redirect to the login page after successful signup
    }
}
