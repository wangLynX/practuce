// Madelyn Wang
// This program will calculate the date easter falls on given a year after 1583.
import java.util.*;

public class Easter{
    public static void main(String[] args) {
        //code goes here
        Scanner scanner = new Scanner(System.in); //this allows you to read input from the user.
        //Let y be the year (such as 1583 or 2003).
        int y = scanner.nextInt(); // reads the next number the user types. 
       
        //Divide y by 19 and call the remainder a. Ignore the quotient.
        int a = y % 19;
        //Divide y by 100 and get a quotient b and a remainder c.
        int b = (int)y/100;
        int c = y%100;
        //Divide b by 4 and get a quotient d and a remainder e.
         int d = (int)b/4;
         int e = b%4;  
        
        //Divide b + 8 by 25 and get a quotient f. Ignore the remainder.
        int f = (int)(b+8)/25;
        //Divide b – f + 1 by 3 and get a quotient g. Ignore the remainder.
         int g = (int)(b-f+1)/3;
        //Divide 19 * a + b – d – g + 15 by 30 and get a remainder h. Ignore the quotient.
        int h = (19*a+b-d-g+15)%30;
        //Divide c by 4 and get a quotient i and a remainder k.
        int i = (int)(c/4);
        int k = c%4;
        //Divide 32 + 2 * e + 2 * i - h - k by 7 and get a remainder r. Ignore the quotient.
        int r = (32 + 2 * e + 2 * i - h - k)%7 ;
        //	Divide a + 11 * h + 22 * r by 451 and get a quotient m. Ignore the remainder.
        int m = (int)(a + 11 * h + 22 * r)/451;
        //Divide h + r - 7 * m + 114 by 31 and get a quotient n and a remainder p.
        int n = (int)(h + r - 7 * m + 114)/31;
        int p = (h + r - 7 * m + 114)%31;

         System.out.print("Easter falls on "+ n+"/");
         System.out.println(p+1 + " in " + y);
    }
}

