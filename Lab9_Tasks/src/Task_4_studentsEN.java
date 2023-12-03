import java.io.*;

public class Task_4_studentsEN {
    public static void main(String[] args) {


        try(BufferedReader br = new BufferedReader(new FileReader("studentsEN.txt"));
            FileWriter fw = new FileWriter("bestStudentsEN.txt")) {

            String s;
            while((s = br.readLine()) != null){
                String[] arrayBest = s.split("\\s");
                String surname = arrayBest[0].trim();
                String name = arrayBest[1].trim();
                String score = arrayBest[2].trim();
                if(score.equals("5")){
                    fw.write(surname + "\s" + name + "\s" + score +"\n");
                }
            }


        }
        catch (IOException e)
        {
            System.out.println("Error IO");
        }


    }
}
