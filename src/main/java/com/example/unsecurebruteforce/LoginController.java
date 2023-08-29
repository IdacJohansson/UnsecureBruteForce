package com.example.unsecurebruteforce;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {

private final LoginRepo loginRepo;

    public LoginController(LoginRepo loginRepo) {
        this.loginRepo = loginRepo;
    }

@RequestMapping("/users")
    public List<Login> getAllUsers(){
        return loginRepo.findAll();
}

/*@PostMapping("users/add")
    public List<Login> addUser(@ResponseBody Login l){
        loginRepo.save(l);
        return loginRepo.findAll();
}*/







    // Create an encoder with strength 16
    /*BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
    String result = encoder.encode("myPassword");
    assertTrue(encoder.matches("myPassword", result));*/
}

