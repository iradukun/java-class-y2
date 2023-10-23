package ac.rca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {

    public static void addDataToFile(String filePath, String Data){
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

    public static void updateDataInFile(String filepath, String oldData, String newData){
        //Read the entire file into a list of strings
        List<String> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
      }
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath)) ){
        for (String line : data) {
            if (line.equals(oldData)) {
                writer.write(newData);
            } else {    
                writer.write(line);
            }
            writer.newLine(); // Add a newline character to separate entries
        }
    } catch (IOException e) {
        e.printStackTrace();
    }   
}}

