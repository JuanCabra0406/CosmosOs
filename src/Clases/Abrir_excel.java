
package Clases;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Abrir_excel {
    public void abrir_Excel() throws IOException, InterruptedException {

                 try {
            
            String excelPath = "C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE";

          
            ProcessBuilder pb = new ProcessBuilder(excelPath);

            
            Process proceso = pb.start();
            
            
            
            System.out.println("Excel debería estar ejecutándose.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
