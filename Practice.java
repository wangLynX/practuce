
import java.util.Scanner;
//Madelyn Wang
//This program is a collection of methods that utilize loops to print out characters in rows
public class  Practice {
public static void main(String [] args) {
     Scanner scan = new Scanner(System.in);
     String input = scan.nextLine();
     stars(9);
     odds(7);
     triangle(9);
     
 }
    public static void stars(int rows){
//  *
//  ***
//  *****


//  *******
//  *********
//  ***********
//  *************
    int index = 0;
    int j = 0;
   while(index<=rows){
    while(j<=index){
        System.out.print("*");
    j++;
    }
    System.out.println(index);
    index++;
   }
for(int p=0;p<rows;p++){
   for(int i=0;i<=p;i++){
       System.out.print("*");


   }
    System.out.println("");
   
}
 
}


   
    public static void triangle(int rows){
        int in = 1;
        int a = 0;
        while(in <= rows) {
            while(a<=in){
             System.out.print(in); 
             a++;
            }
            System.out.println("");
            
           in++;
        }
    }
   
    public static void odds(int start){
       
        for(int i = start; i>=1; i-=2) {
            System.out.print(i);
            for(int j = i+start-2; j>= start; j--){
               System.out.print(i);
               
            }
           System.out.println("");
           
        }
    }
}









