import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//reads out astronaut info/csv reader

public class CsvReader {
    public static void main(String[] args) throws InterruptedException, IOException {
       String file = "astroInfo.csv";
       String line;
       String userName = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e){
            System.out.println(e);
        }
        AstronautInformation.astro(userName);
    }
}