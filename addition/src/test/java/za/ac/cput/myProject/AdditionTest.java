package za.ac.cput.myProject;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by student on 2015/02/13.
 */
public class AdditionTest extends TestCase{
    @Test
    public void testSum() throws Exception {
        Addition a = new Addition();
        assertEquals(4,a.sum(2,2));
    }
}
