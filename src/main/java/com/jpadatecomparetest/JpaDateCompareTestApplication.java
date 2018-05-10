package com.jpadatecomparetest;

import com.jpadatecomparetest.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.jpadatecomparetest.models.*;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JpaDateCompareTestApplication {

	@Autowired
	static PostRepository pr;

	public static void main(String[] args) {

		SpringApplication.run(JpaDateCompareTestApplication.class, args);

	}
}
