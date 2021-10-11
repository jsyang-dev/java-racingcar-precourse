package racinggame.ui;

import racinggame.domain.AttemptCount;
import racinggame.domain.Cars;
import racinggame.domain.RacingGame;
import racinggame.domain.Winners;

public class RacingGameController {

    private final RacingGame racingGame;

    public RacingGameController() {
        racingGame = new RacingGame(getCars(), getAttemptCount());
    }

    public void run() {
        ConsoleView.newLine();
        ConsoleView.printMessage(ConsoleMessage.RESULT_HEADER);
        Winners winners = racingGame.run();
        winners.printResult();
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
            String carNames = ConsoleView.input(ConsoleMessage.CAR_NAMES_INPUT);
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
            String count = ConsoleView.input(ConsoleMessage.ATTEMPT_COUNT_INPUT);
            checkNumber(count);
            return new AttemptCount(Integer.parseInt(count));
        } catch (IllegalArgumentException e) {
            ConsoleView.printErrorMessage(e);
        }
        return null;
    }

    private void checkNumber(String count) {
        if (!count.matches("[0-9]+")) {
            throw new IllegalArgumentException(ConsoleMessage.ATTEMPT_COUNT_ERROR.getMessage());
        }
    }
}
