package org.example;

import java.util.Comparator;

public class RegionComparator implements Comparator<Covid19data> {
    @Override
    public int compare(Covid19data o1, Covid19data o2) {
        int results = o1.getRegion().compareTo(o2.getRegion());
        return results;
    }

}

/*
    int result = this.getLastName().compareTo(o.getLastName()); //compareTo tager kun string
        return result != 0 ? result : this.getFirstName().compareTo(o.getFirstName());
 */
