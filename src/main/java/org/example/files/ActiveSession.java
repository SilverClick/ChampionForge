package org.example.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ActiveSession {
    static String fileName = "src/main/java/org/example/files/user.txt";

    public static void guardarArchivo(String userId) {
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            writer.write(userId);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public static String leerArchivo() {
        StringBuilder content = new StringBuilder();
        try {
            File file = new File(fileName);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return content.toString();
    }
}
