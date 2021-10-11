package racinggame.domain;

public enum Message {

    ATTEMPT_COUNT_ERROR("시도 횟수는 1 이상으로 입력해야 합니다."),
    CAR_NAME_ERROR("자동차 이름은 공백을 제외한 1자 이상, 5자 이하로 입력해야 합니다."),
    CARS_INVALID_NAMES_ERROR("유효한 이름으로 2개 이상 입력해야 합니다."),
    CARS_DUPLICATED_NAMES_ERROR("동일한 이름은 입력할 수 없습니다."),
    WINNERS_RESULT("최종 우승자는 %s 입니다.");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    String getMessage() {
        return message;
    }
}
