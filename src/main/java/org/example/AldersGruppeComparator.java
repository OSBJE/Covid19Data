package org.example;

import java.util.Comparator;

public class AldersGruppeComparator implements Comparator<Covid19data> {


    @Override
    public int compare(Covid19data o1, Covid19data o2) {
        int results = o1.getAldersgruppe().compareTo(o2.getAldersgruppe());
        return results;
    }
}
