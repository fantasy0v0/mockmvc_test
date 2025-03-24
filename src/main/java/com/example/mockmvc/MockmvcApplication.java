package com.example.mockmvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MockmvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockmvcApplication.class, args);
	}

	@Bean
	public CommandLineRunner test(JdbcTemplate jdbcTemplate){
		return args -> {
			jdbcTemplate.execute("insert into test(id, name, age) values (1, 'John', 18)");
			System.out.println("i am a CommandLineRunner");
		};
	}

}
