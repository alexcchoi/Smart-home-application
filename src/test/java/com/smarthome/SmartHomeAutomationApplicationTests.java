package com.smarthome;

import com.smarthome.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(basePackages = "com.smarthome")
class SmartHomeAutomationApplicationTests {

	@MockBean
	private UserService userService;

	@Test
	void contextLoads() {
	}

}
