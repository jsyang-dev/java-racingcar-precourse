package racinggame.ui;

import racinggame.domain.AttemptCount;
import racinggame.domain.Cars;
import racinggame.domain.RacingGame;

public class RacingGameController {

    private final RacingGame racingGame;

    public RacingGameController() {
        racingGame = new RacingGame(getCars(), getAttemptCount());
    }

    private Cars getCars() {
        Cars cars = null;
        while (cars == null) {
            cars = inputCars();
        }
        return cars;
    }

    private Cars inputCars() {
        try {
            String carNames = ConsoleView.input("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            return new Cars(carNames);
        } catch (IllegalArgumentException e) {
            ConsoleView.printErrorMessage(e);
        }
        return null;
    }

    private AttemptCount getAttemptCount() {
        AttemptCount attemptCount = null;
        while (attemptCount == null) {
            attemptCount = inputAttemptCount();
        }
        return attemptCount;
    }

    private AttemptCount inputAttemptCount() {
        try {
            String count = ConsoleView.input("시도할 회수는 몇회인가요?");
            checkNumber(count);
            return new AttemptCount(Integer.parseInt(count));
        } catch (IllegalArgumentException e) {
            ConsoleView.printErrorMessage(e);
        }
        return null;
    }

    private void checkNumber(String count) {
        if (!count.matches("[0-9]+")) {
            throw new IllegalArgumentException("양수인 숫자만 입력해야 합니다.");
        }
    }
}
