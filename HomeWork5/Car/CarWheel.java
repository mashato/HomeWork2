package HomeWork5.Car;

import java.util.Scanner;

/**
 * Created by MARIA on 03.10.17.
 */
public class CarWheel {
Scanner scanner = new Scanner(System.in);

    private double tiresCond = 1;

//empty method constructor
    public CarWheel() {
    }

// constructor with 1 argument
    public CarWheel(double tiresCond) {
        this.tiresCond = tiresCond;
    }

//  method that changes tires to new ones
    public void putNewTires() {
        this.tiresCond = 1;
    }

// method that increases the level of wearing down tires
    public void wearDownTires() {
        System.out.println("Please enter percent on which you want tires to be worn.");
        double percent = scanner.nextInt();
        double tempPercent = percent%100;
        double temp = (this.tiresCond * tempPercent)/100;
        this.tiresCond = temp;
    }

// method that shows tires condition info
    public void showTiresCond() {
        System.out.println(tiresCond);
    }

//    getters and setters
    public double getTiresCond() {
        return tiresCond;
    }
    public void setTiresCond(double tiresCond) {
        this.tiresCond = tiresCond;
    }

}
