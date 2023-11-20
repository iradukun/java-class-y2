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
    return reversed.toString();
   }
   public static String function2(String  str, String sep ){
    return function1(str, sep);
   }

   public static void main(String[] args) {
    String sentence = "Welcome to Rca !";
    String section = function1(sentence, "");
    String result = function2(section, " ");
    System.out.println(result);
}

  
}
