package testhelloworld;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class helloTest {

	@Test
    void testSayHello() {
        
        assertEquals("HelloWorld", helloworld.helloworld.sayHello());
    }
	

}
