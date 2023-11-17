import java.io.File;
import java.io.IOException;


public class filecheck{

    public static void main(String [] args) throws IOException{
        File file=new File("demo.txt"); 
        file.createNewFile();

        if(file.isHidden()){
            System.out.println("file is hidden");
        }
        else{
            System.out.println("File is not hidden");
        }

    }
    
}