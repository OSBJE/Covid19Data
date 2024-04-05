package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class Filehandler {
    private final File file = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");

    public ArrayList<Covid19data> loadCovid19data() {
        ArrayList<Covid19data> covid = new ArrayList();
        Scanner sc = null;
        try {
            sc = new Scanner(file, StandardCharsets.ISO_8859_1);
            sc.nextLine();  // Skip første linje

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Covid19data coviddata = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();    // Split linje og læg tokens i attributter
            String[] attributes = line.split(";");
            coviddata = new Covid19data(
                    (attributes[0]), // region
                    (attributes[1]), // aldersgruppe
                    (Integer.parseInt(attributes[2])), //tilfælde
                    (Integer.parseInt(attributes[3])), // døde
                    (Integer.parseInt(attributes[4])), // indlagtepåIntensive
                    (Integer.parseInt(attributes[5])), // indalgte
                    (attributes[6])
            );


            covid.add(coviddata);

        }
        sc.close();
        return covid;
    }


}
