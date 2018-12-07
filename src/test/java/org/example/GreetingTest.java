package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingTest {

    @Test
    public void testAppHasAGreeting() {
        Greeting greeting = new Greeting();
        assertEquals("Hello world", greeting.getGreeting());
    }

}
