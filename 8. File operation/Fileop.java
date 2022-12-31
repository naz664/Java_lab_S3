import java.io.*;
import java.util.*;

public class Fileop {

    public static void main(String[] args) {
       try{
           File obj= new File("Naz.txt");
           obj.createNewFile();
           System.out.println("File created Successfully "+obj.getName());  
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the text to be written to the file : "); 
           String t=sc.nextLine();
           FileWriter fw=new FileWriter("Naz.txt");
           fw.write(t);
           fw.close();
           System.out.println("Wrote to the file successfully");
           File read = new File("Naz.txt");
           Scanner cs = new Scanner(read);
           while(cs.hasNextLine())
           {
               String b = cs.nextLine();
               System.out.println(b);
           }
           cs.close();
           System.out.println("Read from file successfully");
       } catch (Exception e){
           System.out.println("Something went Wrong");
       }
    }
    
}

