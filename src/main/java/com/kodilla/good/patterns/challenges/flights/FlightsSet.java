package com.kodilla.good.patterns.challenges.flights;
import java.util.ArrayList;
import java.util.List;
public class FlightsSet {
    private List<Connection> flightsList =new ArrayList<Connection>();
    public FlightsSet(List<Connection> flightsList) {
        this.flightsList = flightsList;
    }
    public List<Connection> getFlightsList() {
        return flightsList;
    }
    public void addConnection(Connection connection){
        flightsList.add(connection);
    }
}
