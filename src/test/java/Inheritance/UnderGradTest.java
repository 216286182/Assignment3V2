package Inheritance;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnderGradTest {

    Student stud;

    @Before
    public void setUp() throws Exception {
        stud = new Student();
        stud.setId("216286182");
        stud.setName("Avery");
        stud.setSurname("Daniels");
        stud.setYears(3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getId() {
        Assert.assertEquals(stud.getId(), "216286182");
    }

    @Test
    public void getName() {
        Assert.assertEquals(stud.getName(), "Avery");
    }

    @Test
    public void getSurname() {
        Assert.assertEquals(stud.getSurname(), "Daniels");
    }

    @Test
    public void getYears() {
        Assert.assertEquals(stud.getYears(), 3);
    }
}