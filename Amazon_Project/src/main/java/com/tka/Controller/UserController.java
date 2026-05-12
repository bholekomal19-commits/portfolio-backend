package com.tka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.tka.Entity.User;
import com.tka.Service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userservice;

    // 🔹 login.jsp
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    // 🔹 register.jsp
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    // 🔹 register form
    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        userservice.register(user);
        return "redirect:/login";
    }

    // 🔹 login form
    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        HttpSession session) {

        User user = userservice.login(email, password);

        if (user != null) {
            session.setAttribute("user", user); // ✅ MUST
            return "redirect:/products";
        } else {
            return "login";
        }
    }    
    // ✅ Profile Page
    @GetMapping("/profile")
    public String profile(HttpSession session) {

        User user = (User) session.getAttribute("user");

        if (user == null) {
            return "redirect:/login";  // 🔒 not logged in
        }

        return "profile";
    }

    // ✅ Logout
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}