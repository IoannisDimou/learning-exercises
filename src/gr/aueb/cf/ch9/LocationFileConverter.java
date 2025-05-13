package gr.aueb.cf.ch9;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

public class LocationFileConverter {

    public static void main(String[] args) throws IOException {
        String inputFile = "locations.txt";
        String outputFile = "locations_output.txt";

        try (while (inputFile != null) {
            System.out.println(inputFile);
        })catch (IOException e) {
            System.out.println(LocalDateTime.now() + "," + e);
            throw e;
        }
    }
}
