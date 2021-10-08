package racinggame.domain;

public class AttemptCount {

    private static final int MIN_VALUE = 1;

    private final int value;

    public AttemptCount(int value) {
        checkValue(value);
        this.value = value;
    }

    int getValue() {
        return value;
    }

    private void checkValue(int value) {
        if (isAvailable(value)) {
            throw new IllegalArgumentException("시도 횟수는 1 이상으로 입력해야 합니다.");
        }
    }

    private boolean isAvailable(int value) {
        return value < MIN_VALUE;
    }
}
