import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class wdwd {

    public static void main(String[] args) {
        String url = "https://example.com/data.txt";  // Replace with your actual URL
        String outputFile = "output.txt";  // Replace with your desired output file name

        try {
            // Create a URL object
            URL dataUrl = new URL(url);

            // Open a connection to the URL
            BufferedReader reader = new BufferedReader(new InputStreamReader(dataUrl.openStream()));

            // Create FileWriter to write data to the text file
            FileWriter writer = new FileWriter(outputFile);

            // Read and write data line by line
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write("\n");  // Add a newline after each line if needed
            }

            // Close resources
            reader.close();
            writer.close();

            System.out.println("Data successfully written to " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

