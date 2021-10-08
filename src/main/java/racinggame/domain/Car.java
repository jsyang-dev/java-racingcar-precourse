package racinggame.domain;

public class Car {

    private final CarName carName;
    private final CarPosition carPosition;

    public Car(String name) {
        this.carName = new CarName(name);
        this.carPosition = new CarPosition();
    }

    public String getCarName() {
        return carName.getName();
    }

    public int getCarPosition() {
        return carPosition.getPosition();
    }

    public void moveForward() {
        carPosition.moveForward();
    }
}
