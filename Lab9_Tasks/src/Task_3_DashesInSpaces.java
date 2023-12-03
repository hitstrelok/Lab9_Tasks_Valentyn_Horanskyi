import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task_3_DashesInSpaces {
    public static void main(String[] args) {
         int bajt;

         try(FileInputStream fis = new FileInputStream("file.txt");
            FileOutputStream fos = new FileOutputStream("copyDashes.txt")){

             do{
                 bajt = fis.read();
                 if(bajt == 32) fos.write(150);
                 if(bajt != -1 && bajt != 32) fos.write(bajt);

             } while(bajt != -1);

        } catch (IOException e){
             System.out.println("Error IO");
         }

    }
}
