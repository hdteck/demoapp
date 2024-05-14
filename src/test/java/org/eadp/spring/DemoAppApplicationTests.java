package org.eadp.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoAppApplicationTests {

	@Test
	void contextLoads() {
	}
        @Test
        public void testHelloWorld() {
        HelloWorldService service = new HelloWorldService();
        assertEquals("Hello, world!", service.getMessage());
  }
}
