package com.company.professional;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class ProfFiles {
    public static void run() {

        BufferedReader br = null;
        try {
            File file = new File("newFile.txt");

            if (!file.exists());
                file.createNewFile();

                PrintWriter pw = new PrintWriter(file);
                pw.println("Evrething is working");
                pw.println("All wright!!!");
                pw.close();

                br = new BufferedReader (new FileReader("newFile.txt"));
                String line;
                while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e){
            System.out.println("Error :" + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error :" + e);
            }
        }
    }
}
