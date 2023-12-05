import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;


public class Task_6_LinkToBanks {
    public static void main(String[] args) {
        String link = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";
        try {
            URL url = new URL(link);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            FileWriter fw = new FileWriter("bankData.txt");


            while(br.readLine() != null){
                String[] array =br.readLine().split("\\t+");
                if(array.length>2){
                    String id = array[0].trim();
                    String bankName = array[1].trim();
                    fw.write(id + "\s" + bankName + "\n");
                }
            }

            br.close();
            fw.close();
            System.out.println("Copied!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
