package org.fasttrackit;
import java.time.LocalDate;

public class Vehicle {

    private static int totalCount;

    private String name;
    private double mileage;
    private String color;
    private double maxSpeed;
    private boolean running;
    private double fuelLevel;
    private double traveledDistance;
    private LocalDate createdTime;

    public Vehicle() {
        totalCount++;
    }



    public double accelerate(double speed, double durationInHours) {
        if (fuelLevel <= 0) {
            System.out.println("You don't have enough fuel to accelerate."
                    + "Fuel level: " + fuelLevel);
            return 0;
        }

        if (speed > maxSpeed){
            System.out.println("Requested speed is too high. Maximum speed is: " + maxSpeed);
            return 0;
        }


        //concatenation
        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + "h. ");

        double distance = speed * durationInHours;
        System.out.println("Traveled " + distance + " km.");

//        traveledDistance = traveledDistance + distance;
        //same result as the above statement
        traveledDistance += distance;
        //logs
        System.out.println("Total traveled distance: " + traveledDistance + " km.");

        double spentFuel = distance / 100 * mileage;
        System.out.println("Spent fuel: " + spentFuel + " l.");

//        fuelLevel = fuelLevel - spentFuel;
        //same as above
        fuelLevel -= spentFuel;
        System.out.println("Remaining fuel: " + fuelLevel + " l.");


        return distance;
    }

    public  double accelerate(double speed) {

        accelerate(speed, 1);
        return accelerate(speed, 1);
    }

    // co-variant overriding
    @Override
    protected Vehicle clone() throws CloneNotSupportedException {
        return new Vehicle();
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isRunning() {
        return running;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public LocalDate getCreatedTime() {
        return createdTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public void setCreatedTime(LocalDate createdTime) {
        this.createdTime = createdTime;
    }

    public static int getTotalCount() {
        return totalCount;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", running=" + running +
                ", fuelLevel=" + fuelLevel +
                ", traveledDistance=" + traveledDistance +
                ", createdTime=" + createdTime +
                '}';
    }


}


