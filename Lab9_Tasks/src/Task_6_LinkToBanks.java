import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Objects;
import java.util.Scanner;

public class Task_6_LinkToBanks {
    public static void main(String[] args) {
        String link = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 first digits from your bank id:");
        String number = scanner.nextLine();

        try {
            URL url = new URL(link);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            boolean flag=false;
            String line = br.readLine();
            while(br.readLine() != null){
                    String[] array =br.readLine().split("\\t+");
                    if(array.length>2){
                        String id = array[0].trim().substring(0,3);
                        String bankName = array[1].trim();
                        if(Objects.equals(number, id)){
                            System.out.println(id + "\s" + bankName + "\n");
                            flag=true;
                            break;
                        }
                    }
            }
            if(flag==false){
                System.out.println("Bank not found");
            }
            br.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
