package com.wrtecnologia.appspring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Slf4j
public class AppspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppspringApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		
		// Setting Spring Boot SetTimeZone
		log.info(String.valueOf(ZoneId.systemDefault()));
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		log.info(String.valueOf(ZoneId.systemDefault()));
       {
}
