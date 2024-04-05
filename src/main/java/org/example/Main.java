package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Filehandler fh = new Filehandler();


        ArrayList<Covid19data> covid = fh.loadCovid19data();


        for (Covid19data data: covid) {
            System.out.println(data);
        }
    }
}