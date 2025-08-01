package com.rishi.cicd.git_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitActionsApplication {

	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome to GitHub Actions";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitActionsApplication.class, args);
	}

}
