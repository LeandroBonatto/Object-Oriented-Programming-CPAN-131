
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amrit
 */
public class WriteToFile {

    public WriteToFile() {
        PrintWriter output = null;
        try {
            output = new PrintWriter("text.txt");
            output.println("Welcome to Java");
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            if (output != null) {
                output.close();
            }
        }

    }

    public static void main(String[] args) {
        new WriteToFile();
    }
}
