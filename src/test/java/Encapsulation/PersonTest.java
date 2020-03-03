package Encapsulation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person();
        person.setName("Avery");
        person.setSurname("Daniels");
        person.setAge(23);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        Assert.assertEquals(person.getName(), "Avery");
    }

    @Test
    public void getSurname() {
        Assert.assertEquals(person.getSurname(), "Daniels");
    }

    @Test
    public void getAge() {
        Assert.assertEquals(person.getAge(), 23);
    }
}