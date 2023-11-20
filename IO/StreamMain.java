package IO;
import java.io.*;
import java.util.*;
public class StreamMain {

    public static void main(String[] args) {
        
        FileInputStream in=null;
        FileOutputStream out=null;
        String path="hej";

        try{
            in = new FileInputStream(path);
            out= new FileOutputStream(path);
            int content;
            while((content = in.read()) != -1){
                out.write((byte)content);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    
}
