package com.example.unsecurebruteforce;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login, Long> {
}
