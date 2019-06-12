package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.name = "Dacia";
        car.color = "blue";
        car.doorCount = 4;
        car.mileage = 9.5;
        car.fuelLevel = 50;
        car.running = true;

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        car.engine = engine;

        System.out.println("Our engine");
        System.out.println(car.engine.manufacturer);

        Car car2 = new Car();
        car2.name = "Audi";
        car2.color = "red";
        car2.doorCount = 2;
        car2.mileage = 7.5;
        car2.fuelLevel = 60;
        car2.running = false;

        Car car3 = car;

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println("Changing values...");

        car.name = "Dacia Logan";
        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println(car.maxSpeed);
        System.out.println(car.engine);

        double distance = car.accelerate(60, 0.5);
         distance = car.accelerate(60, 0.5);
        System.out.println("Distance in App.main: " + distance);


    }
}
