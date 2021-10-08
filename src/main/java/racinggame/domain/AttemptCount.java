package racinggame.domain;

public class AttemptCount {

    private static final int MIN_VALUE = 1;

    private final int value;

    public AttemptCount(int value) {
        checkValue(value);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private void checkValue(int value) {
        if (value < MIN_VALUE) {
            throw new IllegalArgumentException("시도 횟수는 1 이상으로 입력해야 합니다.");
        }
    }
}
