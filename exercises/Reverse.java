package exercises;

public class Reverse {
    
   public static String function1(String str, String sep){
    String[] parts= str.split(sep);
    StringBuilder reversed=new StringBuilder();
    for(int i=parts.length-1;i>=0;i--){
        reversed.append(parts[i]);
        if(i>0){
            reversed.append(sep);
        }
    }
   }

  
}
