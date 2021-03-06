package org.launchcode;


import org.launchcode.comparators.*;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        CompoundComparator comparator = new CompoundComparator();
        comparator.add(new StateComparator());
        comparator.add(new PopulationComparator());
        comparator.add(new NameComparator());
        comparator.add(new AreaComparator());

        cities.sort(comparator);

        printCities(cities);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }

}
