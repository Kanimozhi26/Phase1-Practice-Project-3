package practiceproject3;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class writefile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("new.txt");
      myWriter.write("I AM A TEXT");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}