import java.io.*;

/*
 Program Name: WriteCSVFile
 Purpose:
 Creates a CSV file and writes employee records.
*/

public class WriteCSVFile {

    public static void main(String[] args) {

        try{
            FileWriter writer = new FileWriter("employees.csv");

            // Writing header
            writer.append("ID,Name,Department,Salary\n");

            // Writing data
            writer.append("1,Amit,IT,60000\n");
            writer.append("2,Rahul,HR,50000\n");
            writer.append("3,Sneha,Finance,65000\n");
            writer.append("4,Neha,IT,70000\n");
            writer.append("5,Arjun,Marketing,55000\n");

            writer.close();

            System.out.println("CSV Created Successfully!");

        }catch(Exception e){
            System.out.println("Error writing CSV.");
        }
    }
}
