package org.eadp.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoAppApplicationTests {

	@Test
	void contextLoads() {
		DemoAppApplication service = new DemoAppApplication();
		assertEquals("Hola Mundo", service.getMessage());
	}
}
