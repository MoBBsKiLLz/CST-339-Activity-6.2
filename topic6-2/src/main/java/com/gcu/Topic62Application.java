package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@EnableEncryptableProperties
@SpringBootApplication
@ComponentScan({ "com.gcu" })
public class Topic62Application {

	public static void main(String[] args) {
		SpringApplication.run(Topic62Application.class, args);
		//String encoded = new BCryptPasswordEncoder().encode("test");
		//System.out.println(encoded);
	}

}
