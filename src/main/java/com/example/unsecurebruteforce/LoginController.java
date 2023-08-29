package com.example.unsecurebruteforce;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {

private final LoginRepo loginRepo;

    public LoginController(LoginRepo loginRepo) {
        this.loginRepo = loginRepo;
    }

@RequestMapping("/index")
    public List<Login> getAllUsers(){
        return loginRepo.findAll();
}

@PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Login login){
        String userName = login.getUsername();
        String passWord = login.getPassword();

        if ("Bobbo".equals(userName) && "1234".equals(passWord)) {
            return ResponseEntity.ok("Great! Login was successful");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Login was not successful");

    }
}




}

