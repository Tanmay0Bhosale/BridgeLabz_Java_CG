import java.io.*;

/*
 Program Name: ReadCSVFile
 Purpose:
 Reads a CSV file and prints student records in structured format.
*/

public class ReadCSVFile {

    public static void main(String[] args) {

        try {
            // BufferedReader improves reading efficiency
            BufferedReader br =
                    new BufferedReader(new FileReader("students.csv"));

            String line;

            // Skip header row
            br.readLine();

            while((line = br.readLine()) != null){

                // Split values based on comma
                String[] data = line.split(",");

                System.out.println(
                        "ID: " + data[0] +
                                " | Name: " + data[1] +
                                " | Age: " + data[2] +
                                " | Marks: " + data[3]);
            }

            br.close();

        } catch(Exception e){
            System.out.println("Error reading CSV file.");
        }
    }
}
