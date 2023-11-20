package CAT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CAT.CustomException.SeatNumberException;

public class Main {
     public static void addDataToFile(String filePath,String Data){
        try( BufferedWriter writter= new BufferedWriter(new FileWriter(filePath, true))) {
 
            writter.write(Data);
            writter.newLine();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
     public static List<String>readDataFromFile(String filePath){
     List<String>data = new ArrayList<>();
     try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){ 
        String line;
        while((line = reader.readLine()) != null){
            data.add(line);
        }

     }catch(IOException e){
        e.printStackTrace();
     }
     return data;
    }
    public static void main(String[] args) throws SeatNumberException{
          Scanner scanner= new Scanner(System.in);
            String color;
            int numberOfSeats;
            int minHeight;
            int maxHeight;
            ArrayList<Car> arr= new ArrayList<Car>();
        try{
          
            System.out.println("Enter color");
            color= scanner.nextLine();
            System.out.println("Enter number of seats");
            numberOfSeats= scanner.nextInt();
            if(numberOfSeats>100){
                throw new SeatNumberException("The number of seats is beyond 100");
            }
            System.out.println("Enter minimum height");
            minHeight= scanner.nextInt();
            System.out.println("Enter maximum Height");
            maxHeight= scanner.nextInt();
            Car car1= new Car(color, numberOfSeats, minHeight,maxHeight);
           
        //      System.out.println("Testing data");
        //    System.out.println(car1.color);
           String data= car1.color+ car1.numberOfSeats+ car1.minHeight+ car1.maxHeight;
            // Car seats = new Car("red",100,200,100);
            System.out.println("Data to be put into file");
            System.out.println(data);
            addDataToFile("out.txt", car1.color);
            // addDataToFile2("out.txt", car1.numberOfSeats);
            // addDataToFile2("out.txt", car1.minHeight);
            // addDataToFile2("out.txt", car1.maxHeight);
            System.out.println("Data added succesfully");
            System.out.println("=============================");
            System.out.println("Reading data from file");
            System.out.println(readDataFromFile("out.txt"));
        }finally{
            scanner.close();
            // Car car2=new Car(color, numberOfSeats, minHeight,maxHeight);
        }
    }

    
}
