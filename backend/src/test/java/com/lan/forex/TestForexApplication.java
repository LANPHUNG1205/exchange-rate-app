package com.lan.forex;

import org.springframework.boot.SpringApplication;

public class TestForexApplication {

	public static void main(String[] args) {
		SpringApplication.from(ForexApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
