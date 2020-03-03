package Polymorphism;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    Car car;
    @Before
    public void setUp() throws Exception {
        car = new Speedometer();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void drive() {
        car.drive();
        Assert.assertNotNull(car.toString());
    }
}