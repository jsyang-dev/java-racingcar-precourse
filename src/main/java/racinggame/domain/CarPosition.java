package racinggame.domain;

public class CarPosition {

    private int position;

    int getPosition() {
        return position;
    }

    public void action(ActionType actionType) {
        position += actionType.getDistance();
    }
}
