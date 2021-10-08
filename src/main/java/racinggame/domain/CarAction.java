package racinggame.domain;

import nextstep.utils.Randoms;

public class CarAction {

    public static final int MIN_OF_RANGE = 0;
    public static final int MAX_OF_RANGE = 9;
    private static final int FORWARD_START_VALUE = 4;

    public static ActionType getActionType() {
        int number = Randoms.pickNumberInRange(MIN_OF_RANGE, MAX_OF_RANGE);
        if (number >= FORWARD_START_VALUE) {
            return ActionType.FORWARD;
        }
        return ActionType.STOP;
    }
}
