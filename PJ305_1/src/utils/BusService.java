package utils;

import java.util.ArrayList;
import java.util.List;

import model.Bus;

public class BusService {
    private static List<Bus> busList = new ArrayList<>();

    public BusService() {
        for (int i = 0; i < 5; i++) {
            this.busList.add(new Bus(i));
        }
        this.busList.get(0).adjacentBusStop.add(this.busList.get(1));
        this.busList.get(0).adjacentBusStop.add(this.busList.get(4));
        this.busList.get(1).adjacentBusStop.add(this.busList.get(0));
        this.busList.get(1).adjacentBusStop.add(this.busList.get(2));
        this.busList.get(2).adjacentBusStop.add(this.busList.get(1));
        this.busList.get(2).adjacentBusStop.add(this.busList.get(4));
        this.busList.get(3).adjacentBusStop.add(this.busList.get(4));
        this.busList.get(4).adjacentBusStop.add(this.busList.get(0));
        this.busList.get(4).adjacentBusStop.add(this.busList.get(3));
    }

}
