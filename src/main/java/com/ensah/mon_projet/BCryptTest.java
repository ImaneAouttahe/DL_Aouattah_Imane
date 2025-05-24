package com.ensah.mon_projet;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class BCryptTest {
    public static void main(String[] args) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        String rawPassword = "ENSAH";  // mot de passe en clair
        String encodedPassword = passwordEncoder.encode(rawPassword);

        System.out.println("Mot de passe chiffré : " + encodedPassword);
    }
}

