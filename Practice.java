
import java.util.*;
//Madelyn Wang
//This program is a collection of methods that utilize loops to print out characters in rows
public class  Practice {
public static void main(String [] args) {
     Scanner scan = new Scanner(System.in);
     String input = scan.nextLine();

     for(int h = 0; h<input.length()-1; h++){
           if(input.equals(""+h)){
              //int i = Math.floor(input); 
     }
     }
     stars(9);
     odds(7);
     triangle(9);
     eo(8);
     pyramid(5);
     
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
   while(index<rows){
    j=0;
    while(j<=index){
    System.out.print("*");
    j++;
    }
    System.out.println("");
    index++;
   }

 
}


   
    public static void triangle(int rows){
        int in = 0;
        int a = 0;
        while(in <= rows) {
            a=0;
            while(a<in){
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
    public static void eo(int maxE){
//O
//EE
//OOO
//EEEE
//OOOOO
//EEEEEE
//OOOOO
//EEEE
//OOO
//EE
//O
 for(int i = 0; i<=maxE; i++){
    for(int g = 0; g<i; g++){
        if(maxE%2==0){
        if(i%2 == 0){
          System.out.print("E");
        } else{
           System.out.print("O");
        }
    } else {
         if(i%2 == 0){
          System.out.print("O");
        } else{
           System.out.print("E");
        }
    }
    }
System.out.println("");
 }

  for(int i = 0; i<maxE; i++){
    for(int g = maxE-1; g>i; g--){
         if(maxE%2==0){
        if(i%2 == 0){
          System.out.print("O");
        } else{
           System.out.print("E");
        }
    } else {
if(i%2 == 0){
          System.out.print("O");
        } else{
           System.out.print("E");
        }
    }
       
    }
System.out.println("");
 }
    }

public static void pyramid(int rows){
    for(int i = 1; i<=rows; i++){
         for(int y = rows*2+5; y>=i*2; y-=2)
            
            System.out.print(i);
        System.out.println(""); 
        }
         System.out.println("");
    }

}
