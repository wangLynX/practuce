import java.util.Scanner;

//Program picks a pet based off of one's favorite color, season, and their name
public class Pet {

  public static void main(String[] args) {
     System.out.println("enter your favorite color, season, and your name");
      Scanner scan = new Scanner(System.in);
      String color = scan.nextLine().toLowerCase();
       String season = scan.nextLine().toLowerCase();
        String name = scan.nextLine().toLowerCase();
    
    
   if(color!=null && season!=null && name!=null){
        petAssign(color, season, name);
   } else {
     System.out.println("YOU SUCK");
   }
  
  }
  public static String petAssign (String color, String season, String name){
  
     String start = name.substring(0,1);
String j;
     String pet = "";
   for(int i = 0; i<10; i++){
    j = i+"";         
    if (start.equals(j)){
                  System.out.println("Please enter a valid name");
                  return pet;
                }
               }
   if(season.equals("fall")||season.equals("spring")||season.equals("winter")||season.equals("summer")){
      
  
  } else {
          System.out.println("Please enter a valid season");
          return pet;
         }
        
//RED


             if (color.equals("red")){
              
               
              if (start.equals("a") || start.equals("e") || start.equals("i") ||start.equals("o") || start.equals("u")){
                pet = "porcupine";
                System.out.println(pet);
                return pet; 
              } else {
                System.out.println("panda");
                return pet;
              }


  //BLUE             

         } else if (color.equals("blue")){
          
             if (season.equals("spring")){

             pet = "ostrich";
                System.out.println(pet);
                return pet;
           


              } else if ((season.equals("winter")|| season.equals("spring") )&& !start.equals( "e") && !start.equals( "i") &&!start.equals( "a")&& !start.equals( "o") && !start.equals( "u")){
            
                pet = "axolotl";
                System.out.println(pet);
                return pet;
             } else if (season.equals("fall")){
            pet = "alligator";
            System.out.println(pet);
            return pet;

           }

  //GREEN
         
          } else if (color.equals("green")){
           if(season.equals("winter")&&(!start.equals( "e") && !start.equals( "i") &&!start.equals( "a")&& !start.equals( "o") && !start.equals( "u"))){
               pet = "giraffe";
               System.out.println(pet);
               return pet; 
           } else if (!season.equals("fall")){
                pet = "dog"; 
            System.out.println(pet);
            return pet;
           }
         } else {
           
           System.out.println("Please enter a valid color");
            return pet;

         }

         if(season.equals("summer")){
             pet = "pony";
             System.out.println(pet);
             return pet;
         }
         pet = "rock";
         System.out.println(pet);
         return pet;
}

}