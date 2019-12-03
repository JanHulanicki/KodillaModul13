package com.kodilla.good.patterns.challenges.flights;
import java.util.ArrayList;
import java.util.List;
public class FlightsSearchApp {
    public static void main(String[] args) {
        FlightSetRetriever flightSetRetriever = new FlightSetRetriever();
        FlightsSet flightsSet = new FlightsSet(new ArrayList<Connection>());
        Airport airport1=new Airport("airport1");
        Airport airport2=new Airport("airport2");
        Airport airport3=new Airport("airport3");
        flightsSet=flightSetRetriever.retrieve();
        FlightsSearch flightsSearch=new FlightsSearch();
        flightsSearch.searchFrom(airport1,flightsSet);
        flightsSearch.searchTo(airport2,flightsSet);
        flightsSearch.searchToInbetween(airport1,airport2,airport3,flightsSet);
    }
}
