package racinggame.ui;

public enum ConsoleMessage {

    CAR_NAMES_INPUT("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    ATTEMPT_COUNT_INPUT("시도할 회수는 몇회인가요?"),
    ATTEMPT_COUNT_ERROR("양수인 숫자만 입력해야 합니다."),
    RESULT_HEADER("실행 결과");

    private final String message;

    ConsoleMessage(String message) {
        this.message = message;
    }

    String getMessage() {
        return message;
    }
}
