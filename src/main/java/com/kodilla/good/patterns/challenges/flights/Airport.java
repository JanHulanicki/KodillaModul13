package com.kodilla.good.patterns.challenges.flights;
import java.util.Objects;
public class Airport {
    private String airportName;
    public Airport(String airportName) {
        this.airportName = airportName;
    }
    public String getAirportName() {
        return airportName;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(airportName, airport.airportName);
    }
    @Override
    public String toString() {
        return "Airport{" +
                "airportName='" + airportName + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return Objects.hash(airportName);
    }
}
