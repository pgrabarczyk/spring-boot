package com.pgrabarczyk.spring.boot.starter.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootStarterClientApplication {

	public static void main(String[] args) {
		log.info(" <<<<<<< Logs using lombok works ! >>>>>>> ");
		SpringApplication.run(SpringBootStarterClientApplication.class, args);
	}
}
