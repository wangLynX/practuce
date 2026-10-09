import java.util.Scanner;

public class Pet {

  public static void main(String[] args) {
    Scanner color = new Scanner(System.in);
    Scanner season = new Scanner(System.in);
    Scanner name = new Scanner(System.in);
    petAssign(color, season, name); 
  }
  
  public static String petAssign (color, season, name){
           if (color.equals("red")){
              if (name.substring(0,1).equals("a") || name.substring(0,1).equals("e") || name.substring(0,1).equals("i") || name.substring(0,1).equals("o") || name.substring(0,1).equals("u")){
                
              } else {
                 
              }
         } else if (color.equals("blue")){
           
         } else if (color.equals("green")){
           
         } else {

         }
         return "pet";

	}
        
}