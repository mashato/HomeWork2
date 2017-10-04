package HomeWork5.Car;

/**
 * Created by MARIA on 03.10.17.
 */
public class Main {
    public static void main(String[] args) {
       CarDoor door = new CarDoor();
       door.showWindowPosition();
       door.showDoorPosition();
       door.doorPositionSwitcher();
       door.showDoorPosition();
       door.doorPositionSwitcher();
       door.showDoorPosition();

       CarWheel tires = new CarWheel();
        System.out.println(tires.getTiresCond());
//       tires.wearDownTires();
       tires.showTiresCond();
       tires.putNewTires();
       tires.showTiresCond();

       Car newCar = new Car(2015,"E.C. engine",220,
               7,4,2,93);
       Car newC = new Car(2000,"E.C. engine",200,
               6.9,4,1,60);
       newCar.showCarInfo();
       newC.showCarInfo();

       UserMenu show = new UserMenu();
       show.userMenu();


    }
}
