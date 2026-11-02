
import java.util.Scanner;
//Madelyn Wang
//This program is a collection of methods that utilize loops to print out characters in rows
public class  Practice {
public static void main(String [] args) {
     Scanner scan = new Scanner(System.in);
     String input = scan.nextLine();
     stars(4);
     odds(9);
     
 }
    public static void stars(int rows){
//  *
//  ***
//  *****


//  *******
//  *********
//  ***********
//  *************
    int index = 1;
   
for(int p=0;p<rows;p++){
   for(int i=0;i<=p;i++){
       System.out.print("*");


   }
    System.out.println("");
   
}
 
}


   
    public static void triangle(int rows){
        int in = 1;
        while(in < 10) {
           
        }
    }
   
    public static void odds(int start){
       
        for(int i = 9; i>=1; i-=2) {
            System.out.print(i);
            for(int j = i; j<= start; j++){
               System.out.print(i);
            }
           
        }
    }
}









