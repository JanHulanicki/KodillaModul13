package com.kodilla.good.patterns.challenges.flights;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class FlightsSearch {
    private List<Connection> listconn; //=new List<Airport>();
    private Airport airportFrom;
    private Airport airportTo;
    private Airport airportInBetween;
    List<Connection> searchFrom(Airport airportFrom, FlightsSet flightsSet){
        listconn=flightsSet.getFlightsList().stream().filter(i->i.startAirport.equals(airportFrom)).collect(Collectors.toList());
        for (int i=0;i<listconn.size();i++) {
            System.out.println("lista lotow z "+airportFrom.getAirportName()+" "+listconn.get(i).getEndAirport().toString());
        }
       return listconn;
    }
    List<Connection> searchTo(Airport airportTo, FlightsSet flightsSet) {
        listconn = flightsSet.getFlightsList().stream().filter(i -> i.endAirport.equals(airportTo)).collect(Collectors.toList());
        for (int i = 0; i < listconn.size(); i++) {
            System.out.println("lista lotow do "+airportTo.getAirportName()+" "+listconn.get(i).getStartAirport().toString());
        }
        return listconn;
    }
    List<Connection> searchToInbetween(Airport airportFrom, Airport airportInBetween, Airport airportTo, FlightsSet flightsSet){
        listconn = flightsSet.getFlightsList().stream()
                .filter(i->((i.startAirport.equals(airportFrom) && i.endAirport.equals(airportInBetween))
                        ||(i.startAirport.equals(airportInBetween) && i.endAirport.equals(airportTo))))
                .collect(Collectors.toList());
        for (int i = 0; i < listconn.size(); i++) {
            System.out.println("lista lotow z "+airportFrom.getAirportName()+" "+ "przez "+airportInBetween.getAirportName()+" "+"do "+airportTo.getAirportName()+" "+listconn.get(i).getStartAirport().toString());
        }
        return listconn;
    }
}
