package com.kodilla.good.patterns.search;

import java.util.ArrayList;
import java.util.List;

public final class FlightData {
    public static List<Flight> getList() {
        final List<Flight> theList = new ArrayList<Flight>();
        theList.add(new Flight("Warsaw","Cracow",""));
        theList.add(new Flight("Warsaw","London",""));
        theList.add(new Flight("Poznan","London",""));
        theList.add(new Flight("Bydgoszcz","Cracow",""));
        theList.add(new Flight("Bydgoszcz","Moscow","Riga"));
        theList.add(new Flight("Warsaw","Praha","Cracow"));
        theList.add(new Flight("Praha","Warsaw","Olso"));
        theList.add(new Flight("Bydgoszcz","Oslo",""));
        theList.add(new Flight("Wroclaw","Oslo",""));
        theList.add(new Flight("Oslo","Warsaw","Riga"));
        theList.add(new Flight("Bydgoszcz","Cracow","Warsaw"));
        theList.add(new Flight("Poznan","Cracow",""));

        return new ArrayList<Flight>(theList);
    }
}
