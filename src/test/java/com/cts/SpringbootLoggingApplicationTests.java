package com.cts;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLoggingApplicationTests {

	@Test
	void contextLoads() {
		
		boolean result = true;
		assertThat(result).isTrue();
	}

}
