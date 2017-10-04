package HomeWork5.Car;

import java.util.Scanner;

/**
 * Created by MARIA on 04.10.17.
 */
public class UserMenu {

//    ПРОБЛЕМА
//    Я по разному уже пробовала, и я уже вообще не понимаю в чем здесь проблема((
    Scanner scanner = new Scanner(System.in);
    UserMenu menuUse = new UserMenu();

    CarDoor doorUse = new CarDoor();
    CarWheel wheelUse = new CarWheel();
    Car carUse = new Car("default");

    //    USER MENU
    public void userMenu() {
        System.out.println("\n\t-----------------------------------------------");
        System.out.println("\t\t\t\t\t\t| MENU |");
        System.out.println("\t-----------------------------------------------");
        System.out.println("\tPlease, choose what you want to do about a car\n");
//        System.out.println("\t\t----------------");
        System.out.println("\t\t\t\t\t\tDOOR");
        System.out.print("\tOpen [0]");
        System.out.print("\tClose [1]");
        System.out.print("\tShow current position [2]");

        System.out.println("\n\n\t\t\t\t\t\tWINDOW");
        System.out.print("\tOpen [3]");
        System.out.print("\tClose [4]");
        System.out.print("\t\tShow current position [5]\n\n");
        System.out.println("\tShow current door`s and window`s positions [6]");

        System.out.println("\n\t\t\t\t\t\tWHEELS");
        System.out.print("\tWear down tires [7]");
        System.out.print("\t\tPut on new tires [8]\n");
        System.out.println("\tShow tires`s condition [9]");

        System.out.println("\n\t\t\t\t\t\tOTHER");
        System.out.print("\tChange current speed [10]");
        System.out.print("\t\tAdd one passenger into a car [11]\n");
        System.out.print("\tTake one passenger out [12]");
        System.out.print("\t\tTake out all passengers [13]\n");
        System.out.print("\tReveal door`s index [14]");
        System.out.print("\t\tReveal wheel`s index [15]\n");
        System.out.print("\tAdd wheels to a car [16]");
        System.out.print("\t\tShow  possible current max speed [17]\n");
        System.out.println("\tShow car info [18]\n");
        System.out.println("Please enter a number here:");
        String choice = scanner.next();
        int temp = Integer.parseInt(choice);
        returnToUser((temp));




    private void returnToUser(int choice) {

        switch (choice) {
            case 0:
                doorUse.doorPositionSwitcher();
                break;
            case 1:
                doorUse.doorPositionSwitcher();
                break;
            case 2:
                doorUse.showDoorPosition();
                break;
            case 3:
                doorUse.windowPositionSwitcher();
                break;
            case 4:
                doorUse.windowPositionSwitcher();
                break;
            case 5:
                doorUse.showWindowPosition();
                break;
            case 6:
                doorUse.showWindowPosition();
                doorUse.showDoorPosition();
                break;
            case 7:
                wheelUse.wearDownTires();
                break;
            case 8:
                wheelUse.putNewTires();
                break;
            case 9:
                wheelUse.showTiresCond();
                break;
            case 10:
                carUse.changeSpeed();
                break;
            case 11:
                carUse.incPassAmount();
                break;
            case 12:
                carUse.decPassAmount();
                break;
            case 13:
                carUse.disembarkPass();
                break;
//            case 14:
//                carUse.
//                break;
//            case 15:
//                break;
//            case 16:
//                break;
//            case 17:
//                break;
            case 18: carUse.showCarInfo();
                break;
        }
    }
}






