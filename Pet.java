import java.util.Scanner;

public class Pet {

  public static void main(String[] args) {
     System.out.println("enter your favorite color, season, and your name");
      Scanner scan = new Scanner(System.in);
      String color = scan.nextLine();
       String season = scan.nextLine();
        String name = scan.nextLine();
    
    
   if(color!=null && season!=null && name!=null){
        petAssign(color, season, name);
   } else {
     System.out.print("YOU SUCK");
   }
  
  }
  public static String petAssign (String color, String season, String name){
   name = name.toLowerCase();
     String start = name.substring(0,1);

   String pet = "";
           if (color.equals("red")){
               
               
              if (start.equals("a") || start.equals("e") || start.equals("i") ||start.equals("o") || start.equals("u")){
                pet = "porcupine";
                System.out.println(pet);
                return pet; 
              } else {
                System.out.print("panda");
                return pet;
              }
         } else if (color.equals("blue")){
           
         } else if (color.equals("green")){
           
         } else {
           pet = "YOU SUCK";
           System.out.print("YOU SUCK");
            return pet;

    

         }
         pet = "rock";
         System.out.print(pet);
         return pet;

	
        
}

}