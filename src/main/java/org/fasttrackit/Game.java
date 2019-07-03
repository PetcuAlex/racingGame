package org.fasttrackit;

public class Game {


    private Vehicle competitor1;
    private Vehicle getCompetitor2;

    private Track[] tracks = new Track[3];

    public void start() {
        initializeTracks();
        displayTrack();


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

