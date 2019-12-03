package com.kodilla.good.patterns.challenges.flights;
import java.util.ArrayList;
public class FlightSetRetriever {
    public FlightsSet retrieve() {
        Airport airport1 = new Airport("airport1");
        Airport airport2 = new Airport("airport2");
        Airport airport3 = new Airport("airport3");
        Airport airport4 = new Airport("airport4");
        Connection connection1 = new Connection(airport1, airport2);
        Connection connection2 = new Connection(airport2, airport3);
        Connection connection3 = new Connection(airport3, airport4);
        FlightsSet flightsSet = new FlightsSet(new ArrayList<Connection>());
        flightsSet.addConnection(connection1);
        flightsSet.addConnection(connection2);
        flightsSet.addConnection(connection3);
        for (int i = 0; i < flightsSet.getFlightsList().size(); i++) {
            System.out.println("lista flightset endairport "+flightsSet.getFlightsList().get(i).getEndAirport().toString());
        }
        return flightsSet;
    }
}


