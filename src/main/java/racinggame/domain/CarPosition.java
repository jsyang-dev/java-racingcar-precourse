package racinggame.domain;

public class CarPosition {

    private int position;

    public int getPosition() {
        return position;
    }

    public void moveForward() {
        position++;
    }
}
