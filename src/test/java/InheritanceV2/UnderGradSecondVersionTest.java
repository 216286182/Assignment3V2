package InheritanceV2;

import Inheritance.UnderGrad;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnderGradSecondVersionTest {

    UnderGrad grad;
    @Before
    public void setUp() throws Exception {
        grad  = new UnderGrad();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void main() {
        String test = grad.toString();
        Assert.assertNotNull(test);
    }
}