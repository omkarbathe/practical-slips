
import java.io.*;
import java.util.Scanner;


public class fileIO {
    public static void main(String[] args) {
         try{
                File demo=new File("demo.txt");
                boolean flag=demo.createNewFile();
                 if (flag) {
                    System.out.println("file is created Successfully");
                    
                 }
                 else{
                    System.out.println("failed to create");
                 }
                
            }catch(Exception e){
                System.out.println(e);

            }
        
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter tour Option: \n 1. Get path \n 2. Rename File \n 3.delete file");
        int a = sc.nextInt();
        switch(a){

          
           

            case 1:
            System.out.println("demo.getPath()");


            case 2:
            File rename = new File("HelloWorld.txt"); 
            boolean flag = demo.renameTo(rename); 
  
            
            if (flag == true) { 
                System.out.println("File Successfully Rename"); 
            } 
            
            else { 
                System.out.println("Operation Failed"); 
            } 
            
           case 3:
           boolean result = demo.delete();
           if(flag){
            System.out.println("file deleted");
            }
            else{
                System.out.println("Failed to delete");;
            }


            



        }
        
       


    }
}
