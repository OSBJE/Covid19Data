package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Userinterface {

    Scanner input = new Scanner(System.in);

    Filehandler fh = new Filehandler();

    ArrayList<Covid19data> covid = fh.loadCovid19data();

    public void menu() {
        System.out.println("Welcome to the Menu");
        System.out.println("1. Show unsorted data");
        System.out.println("2. Sort data after region");
        System.out.println("3. Sort data after aldersgruppe");
        System.out.println("4. Sort multiple værdier");


        int UserInput = 5;
        int SENTINNEL = 0;

        while(UserInput != SENTINNEL) {
            UserInput = input.nextInt();
            switch (UserInput) {
                case 1 -> uSortData();
                case 2 -> sortedDataRegion();
                case 3 -> sortedDataAldersgruppe();
                case 4 -> sortMultiple();
                default -> System.out.println("Done and exit");

            }

        }
    }

    public void uSortData () {
        System.out.println("Usorted list");
        for (Covid19data data: covid) {
            System.out.println(data);
        }
    }

    public void sortedDataRegion (){
        System.out.println();

        System.out.println("sorted List efter region");
        Collections.sort(covid, new RegionComparator());
        for (Covid19data data: covid) {
            System.out.println(data);
        }
    }

    public void sortedDataAldersgruppe (){
        System.out.println();

        System.out.println("sorted List efter region");
        Collections.sort(covid, new AldersGruppeComparator());
        for (Covid19data data: covid) {
            System.out.println(data);
        }

    }

    public void sortMultiple () {
        Collections.sort(covid, new RegionComparator().thenComparing(new AldersGruppeComparator()));
        for (Covid19data data : covid) {
            System.out.println(data);
        }

    }
}
