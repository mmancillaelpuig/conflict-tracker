package com.example.conflict_tracker2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConflictTracker2Application {

	public static void main(String[] args) {
		SpringApplication.run(ConflictTracker2Application.class, args);
	}

	//Curl que probar
	//curl -X POST http://localhost:8080/api/v1/conflicts/add -H "Content-Type: application/json" -d "{\"id\":1,\"name\":\"Simple\",\"startDate\":\"2024-01-01\",\"conflictStatus\":\"ACTIVE\",\"description\":\"Simple test\"}"

}
