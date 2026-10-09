import java.util.Scanner;

public class Pet {

  public static void main(String[] args) {
      Scanner color = new Scanner(System.in);
    Scanner season = new Scanner(System.in);
    Scanner name = new Scanner(System.in);
   if(color!=null && season!=null && name!=null){
        petAssign(color, season, name);
   }
  
  }
  public static String petAssign (String color, String season, String name){
  
           if (color.equals("red")){
            String start = name.substring(0,1);
              if (start.equals("a") || start.equals("e") || start.equals("i") ||start.equals("o") || start.equals("u")){
                
              } else {
                 
              }
         } else if (color.equals("blue")){
           
         } else if (color.equals("green")){
           
         } else {

         }
         return "pet";

	
        
}

}