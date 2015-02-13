package za.ac.cput.myProject;

/**
 * Created by student on 2015/02/13.
 */
public class Divider {

    public double divide(int a, int b)
    {
        if(a==0)
        {
            throw new ArithmeticException();
        }
        return a/b;
    }
}
