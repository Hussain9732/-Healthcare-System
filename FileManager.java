package Smarthealthcare;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {

    public static void append(String path, String line) throws HealthcareException {
        try (FileWriter fw = new FileWriter(path, true)) {
            fw.write(line);
            fw.write(System.lineSeparator());
        } catch (IOException e) {
            throw new HealthcareException("File write error: " + e.getMessage());
        }
    }

    public static void printAll(String path) throws HealthcareException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String x;
            while ((x = br.readLine()) != null) {
                System.out.println(x);
            }
        } catch (IOException e) {
            throw new HealthcareException("File read error: " + e.getMessage());
        }
    }
}
