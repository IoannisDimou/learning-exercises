package gr.aueb.cf.ch9;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

/**
 *
 */
public class LocationFileConverter {

    public static void main(String[] args) throws IOException {
        String inputFile = "locations.txt";
        String outputFile = "formattedLocations.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

            }

        }
    }
}
