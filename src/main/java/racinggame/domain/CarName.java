package racinggame.domain;

public class CarName {

    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 5;

    private final String name;

    public CarName(String name) {
        String trimmedName = name.trim();
        checkLength(trimmedName);
        this.name = trimmedName;
    }

    public String getName() {
        return name;
    }

    private void checkLength(String name) {
        if (name.length() < MIN_LENGTH || name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 공백을 제외한 1자 이상, 5자 이하로 입력해야 합니다.");
        }
    }
}
