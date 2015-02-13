
package za.ac.cput.myProject;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{



    public static void main( String[] args )
    {
        int aa;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        Addition a = new Addition();
        Divider d = new Divider();
        Subtraction s = new Subtraction();
        MainMenu m =  new MainMenu();

        System.out.println(m.getMenu());
        c=scanner.nextInt();
        /*System.out.print("1");
        aa = scanner.nextInt();
        System.out.print("");
        b = scanner.nextInt();*/
        while (c != 4){
        if(c == 1)
        {
            System.out.print("Please enter first number : ");
            aa = scanner.nextInt();
            System.out.print("Please enter first number : ");
            b = scanner.nextInt();
            System.out.print("Sum is : "+a.sum(aa,b));
        }
        else if(c == 2)
        {
            System.out.print("Please enter first number : ");
            aa = scanner.nextInt();
            System.out.print("Please enter first number : ");
            b = scanner.nextInt();
            System.out.println("Difference is : " + s.difference(aa,b));
        }
        else if(c == 3)
        {
            System.out.print("Please enter first number : ");
            aa = scanner.nextInt();
            System.out.print("Please enter first number : ");
            b = scanner.nextInt();
            System.out.println("Difference is : " +d.divide(aa,b));
        }else{
            System.out.println("Invalid selection it must be either 1,2,3 or 4");
        }

            System.out.println();
            System.out.println(m.getMenu());
            c=scanner.nextInt();
        }

    }
}
