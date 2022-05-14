package classE;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UserReader {

    static void read() {
         try {
             File file1 = new File("C:\\Users\\Ilia\\IdeaProjects\\L9-TamrinClass\\L10files\\L10-1.txt");
             Scanner scanner = new Scanner(file1);
             while (scanner.hasNextLine()) {
                  String data = scanner.nextLine();
                 System.out.println(data);
             }
             scanner.close();
             System.out.print("Successfully read the file:");
         } catch (
                 IOException e) {
             e.printStackTrace();

         }
     }
}
