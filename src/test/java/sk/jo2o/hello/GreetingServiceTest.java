package sk.jo2o.hello;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingServiceTest {

    GreetingService service;

    @Before
    public void setup() {
        service = new GreetingService();
    }

    @Test
    public void testGreet() {
        assertEquals("Hell Test", service.greet("Test"));
    }
}