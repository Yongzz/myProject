package za.ac.cput.myProject;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class TestSubtraction {

    @Test
    public void testDifference() throws Exception {
        Subtraction s = new Subtraction();
        Assert.assertEquals(2,s.difference(4,2));
    }
}
