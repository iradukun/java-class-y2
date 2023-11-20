package exceptions;

import java.util.*;


public class Question{
    public static void main(String[] args) throws OuOfRange{
        ArrayList<Integer> arr= new ArrayList<Integer>();
       Scanner scanner= new Scanner(System.in);
       for(int i=0; i<5; i++){
        System.out.println("Enter number "+(i+1)+ ":");
        int num = scanner.nextInt();
          arr.add(num);
       }
       Collections.sort(arr,Collections.reverseOrder());
       try{
        System.out.print("Enter the Index where you want to check number:  ");
       int index = scanner.nextInt();
       if(index>5){
        throw new OuOfRange("you have gone Out Of Range");
        
       }else{
        System.out.println("The element at index "+index+" is :"+arr.get(index));
       }

       }catch(OuOfRange e){
        e.printStackTrace();
       }finally{

        System.out.println("They array was:   =================================================================");
        System.out.println("\n"+"\n"+"\n"+arr+"\n");
        scanner.close();
       }
      

       



    }

    
}