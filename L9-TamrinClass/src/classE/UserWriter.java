package classE;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserWriter {
    static void write() {
        try {
            FileWriter file2 = new FileWriter("C:\\Users\\Ilia\\IdeaProjects\\L9-TamrinClass\\L10files\\L10-2.txt");
            file2.write("JAVA L10\n" +
                    "Class Exercise Test");
            file2.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
