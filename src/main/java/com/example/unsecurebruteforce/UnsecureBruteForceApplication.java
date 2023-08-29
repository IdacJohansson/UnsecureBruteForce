package com.example.unsecurebruteforce;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class UnsecureBruteForceApplication {


    @Bean
    public CommandLineRunner pojo(LoginRepo loginrepo){
        return args -> {

            Login l1 = new Login("1234", "Bobbo");
            Login l2 = new Login("5678", "Doddo");

            loginrepo.save(l1);
            loginrepo.save(l2);


        };
    }

    public static void encryptUserPassword(){
        String password = "Hello";
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);
        String result = encoder.encode(password);
        System.out.println("encoded password = " + result);

    }



    public static void main(String[] args) {
        SpringApplication.run(UnsecureBruteForceApplication.class, args);
        encryptUserPassword();

}

}
