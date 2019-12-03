package com.kodilla.good.patterns.challenges.flights;

public class Connection {
    Airport startAirport;
    Airport endAirport;

    public Connection(Airport startAirport, Airport endAirport) {
        this.startAirport = startAirport;
        this.endAirport = endAirport;
    }
    public Airport getStartAirport() {
        return startAirport;
    }
    public Airport getEndAirport() {
        return endAirport;
    }
}
