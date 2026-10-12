import java.util.Scanner;

public class Pet {

  public static void main(String[] args) {
      Scanner color = new Scanner(System.in);
    Scanner season = new Scanner(System.in);
    Scanner name = new Scanner(System.in);
    String colorInput = color + "";
    String seasonInput = season +"";
    String nameInput = name +"";
   if(colorInput!=null && seasonInput!=null && nameInput!=null){
        petAssign(colorInput, seasonInput, nameInput);
   }
  
  }
  public static String petAssign (String color, String season, String name){
   String start = name.substring(0,1);
           if (color.equals("red")){
           
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