package com.entra21.eventoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class EventoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventoappApplication.class, args);
//		System.out.print(new BCryptPasswordEncoder().encode("456"));
	}
}
