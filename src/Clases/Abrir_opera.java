
package Clases;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import java.io.IOException;

public class Abrir_opera {
     public void abrir_Opera() throws IOException, InterruptedException {

                 try {
            
            String excelPath = "C:\\Users\\areva\\AppData\\Local\\Programs\\Opera GX\\opera.exe";

          
            ProcessBuilder pb = new ProcessBuilder(excelPath);

            
            Process proceso = pb.start();
            
            
            
            System.out.println("Opera debería estar ejecutándose.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
