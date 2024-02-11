package com.vikram.selenium.chrome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestChromeApplication {

	public static void main(String[] args) {
		SpringApplication.from(ChromeApplication::main).with(TestChromeApplication.class).run(args);
	}

}
