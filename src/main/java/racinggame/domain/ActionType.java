package racinggame.domain;

public enum ActionType {

    FORWARD(1), STOP(0);

    private final int distance;

    ActionType(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
