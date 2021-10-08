package racinggame.domain;

public enum ActionType {

    FORWARD(1), STOP(0);

    private final int move;

    ActionType(int move) {
        this.move = move;
    }

    public int getMove() {
        return move;
    }
}
