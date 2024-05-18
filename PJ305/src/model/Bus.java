package PJ305.src.model;

import java.io.*;
import java.util.*;

public class Bus {
    private int busNumber;
    private List<Bus> adjacentBusStop;
    private HashMap<Integer, String[]> departureTimeOfEachRoute;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
        this.adjacentBusStop = new ArrayList<>();
        this.departureTimeOfEachRoute = new HashMap<>();
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public List<Bus> getAdjacentBusStop() {
        return adjacentBusStop;
    }

    public void setAdjacentBusStop(List<Bus> adjacentBusStop) {
        this.adjacentBusStop = adjacentBusStop;
    }

    public HashMap<Integer, String[]> getDepartureTimeOfEachRoute() {
        return departureTimeOfEachRoute;
    }

    public void setDepartureTimeOfEachRoute(HashMap<Integer, String[]> departureTimeOfEachRoute) {
        this.departureTimeOfEachRoute = departureTimeOfEachRoute;
    }

}
