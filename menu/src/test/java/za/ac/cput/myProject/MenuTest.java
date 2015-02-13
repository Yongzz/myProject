package za.ac.cput.myProject;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by student on 2015/02/13.
 */
public class MenuTest extends TestCase{

    @Test
    public void testGetMenu() throws Exception {
        MainMenu m = new MainMenu();
        Assert.assertEquals("1. Add\n" +
                            "2. Subtract\n" +
                            "3. Divide\n" +
                            "4. Exit\n",m.getMenu());
    }
}
