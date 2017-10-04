package HomeWork5.Car;

/**
 * Created by MARIA on 03.10.17.
 */
public class CarDoor {
    private boolean isDoorClosed = true;
    private boolean isWindowClosed = true;

//    пустой конструктор класса

    public CarDoor() {

    }
//конструктор класса с двумя аргументами

    public CarDoor(boolean isDoorClosed, boolean isWindowClosed) {
        this.isDoorClosed = isDoorClosed;
        this.isWindowClosed = isWindowClosed;
    }


    //геттеры и сеттеры
    public boolean getIsDoorClosed() {
        return isDoorClosed;
    }

    public void setIsDoorClosed(boolean doorClosed) {
        isDoorClosed = doorClosed;
    }

    public boolean getIsWindowClosed() {
        return isWindowClosed;
    }

    public void setIsWindowClosed(boolean windowClosed) {
        isWindowClosed = windowClosed;
    }

//    METHODS:
//    Method for closing/opening a door
boolean doorPosition;

    public void doorPositionSwitcher() {
        if (isDoorClosed == false) {
            isDoorClosed = true;
            doorPosition = isDoorClosed;
        } else if (isDoorClosed == true) {
            isDoorClosed = false;
            doorPosition = isDoorClosed;

        }
    }

    //    Method for closing/opening a window
    boolean windowPosition;

    public void windowPositionSwitcher() {
        if (isWindowClosed == false) {
            isWindowClosed = true;
            windowPosition = isWindowClosed;
        } else if (isWindowClosed == true) {
            isWindowClosed = false;
            windowPosition = isWindowClosed;

        }
    }

// Method that shows door status

    public void showDoorPosition() {
        System.out.println("Door is opened: " + doorPosition);
    }
    // Method that shows door status

    public void showWindowPosition() {
        System.out.println("Window is opened: " + windowPosition);
    }
}
