package HomeWork5.Car;

import java.util.Scanner;

/**
 * Created by MARIA on 03.10.17.
 */
public class Car {
Scanner scanner = new Scanner(System.in);

    static private int dateOfManufacture = 0;
    private String engineType = "default";
    private int maxSpeed = 0;
    private double acceleration = 0;
    private int passSeats = 0;
    private int currentPassAmount = 0;
    private double currentSpeed = 0;
    private CarWheel[] wheels;
    private CarDoor[] doors;


    CarDoor carDooor = new CarDoor();


    public Car(int dateOfManufacture1,String engineType,int maxSpeed,double acceleration, int passSeats,
               int currentPassAmount, int currentSpeed) {
        dateOfManufacture = dateOfManufacture1;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.passSeats = passSeats;
        this.currentPassAmount = currentPassAmount;
        this.currentSpeed = currentSpeed;
    }

    public Car(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

//    Отдельный метод для дефолтного заполнения информации о машине
    public Car(String forMyUse) {
        if (forMyUse == "default") {
            new Car(2000,"E.C. engine",200,
                    6.9,4,1,60);
        }
    }


//    method that changes the speed
    public void changeSpeed() {
        double speed = scanner.nextDouble();
        this.currentSpeed = speed;
    }

//    method for increasing the number of passengers inside
    public void incPassAmount() {
        this.currentPassAmount = this.currentPassAmount + 1;
    }

    //    method for decreasing the number of passengers inside
    public void decPassAmount() {
        this.currentPassAmount = this.currentPassAmount - 1;
    }
// method for taking out all of the passengers
    public void disembarkPass() {
        this.currentPassAmount = 0;
    }



//----------------> ПРОБЛЕМА
//    method for getting index of a door
//    int doorI;
// >   public void getDoorI(int i) {
//        int doorI = doors[i];  ??
//    Здесь почему-то не выходит получить индекс элемента массива. Так и не поняла в чем проблема
//    }
//
////    method for removing all the tires
// >   public void removeTires() {
//        ?
//    Здесь, я так понимаю, нужно обнулить массив колес, верно?
//    }
//// method for adding N amount of wheels to existing wheels(increasing amount of wheels)
// >   public void addWheels(int amount) {
//        ?
//    Здесь (моя лучшая пока догадка) нужно скопировать существующий массив в новый массив , длинну которого установить как
//    длина существующего массива + какой-то int amount. После чего, в этом же методе заполнить каким-то образом эти новые
//      пустые элементы массива наверное по возрастанию? Если честно, тут вообще очень запуталась с массивами(
//    }
//// method for finding the highest possible speed
// >   ?
//    Прописать if(currentPassAmount = 0) тогда установить для currentSpeed значение 0, и прописать else и там уже
//    сначала сравнить все существующие колеса по их состоянию и вычеслить минимум. Умножить этот минимум на maxSpeed.

//------------------------------------------------------------------------------------ <----------
//    method that shows all the data:
    public void showCarInfo() {
        System.out.println("\t\t\tCAR INFO");
        System.out.println("\t\t----------------");
        System.out.println("Date of manufacture:\t" + dateOfManufacture);
        System.out.println("\nType of engine:\t\t\t" + engineType);
        System.out.println("\nMaximum speed:\t\t\t" + maxSpeed);
        System.out.println("\nAcceleration time:\t\t" + acceleration);
        System.out.println("\nPassengers seats:\t\t" + passSeats);
        System.out.println("\nCurrent number of \npassengers inside:\t\t" + currentPassAmount);
        System.out.println("\nCurrent speed:\t\t\t" + currentSpeed);
    }

//getter for dateOfManufacture
    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

}
