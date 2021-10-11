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

    String getName() {
        return name;
    }

    private void checkLength(String name) {
        if (isAvailable(name)) {
            throw new IllegalArgumentException(Message.CAR_NAME_ERROR.getMessage());
        }
    }

    private boolean isAvailable(String name) {
        return name.length() < MIN_LENGTH || name.length() > MAX_LENGTH;
    }
}
