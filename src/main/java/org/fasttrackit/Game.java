package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {


    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();


    public void start() {
        initializeTracks();
        displayTrack();

        int countCompetitors = getCompetitorsNumberFromUser();
        for (int i = 0; i < countCompetitors; i++) {
            addCompetitor();
        }
        displayCompetitors();

    }


    private void addCompetitor() {

        Vehicle vehicle = new Vehicle();
        vehicle.setName(getVehicleNameFromUser());
        vehicle.setMaxSpeed(200);
        vehicle.setMileage(ThreadLocalRandom.current().nextDouble(4, 20));
        vehicle.setFuelLevel(60);

        competitors.add(vehicle);

    }

    private int getCompetitorsNumberFromUser() {
        System.out.println("Please enter vehicle count:");
        Scanner in = new Scanner(System.in);
        return in.nextInt();


    }


    private String getVehicleNameFromUser() {

        System.out.println("Enter you vehicle name:");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private void displayCompetitors() {
        System.out.println("Today competitors are:");
        System.out.println("--------------------------------");

        for (int i = 0; i < competitors.size(); i++) {

            System.out.println(competitors.get(i).getName() + " - mileage: " + competitors.get(i).getMileage());
        }

    }


    private void displayTrack() {
        System.out.println("Available tracks: ");
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i + 1) + ". " + tracks[i].getName());
            }
        }
    }

    private void initializeTracks() {
        Track city = new Track();
        city.setName("Cluj Track");
        city.setLength(100);

        tracks[0] = city;

        Track forest = new Track();
        forest.setName("Faget Track");
        forest.setLength(20);

        tracks[1] = forest;
    }


}

