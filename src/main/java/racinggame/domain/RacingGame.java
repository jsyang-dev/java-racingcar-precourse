package racinggame.domain;

public class RacingGame {

    private final Cars cars;
    private final AttemptCount attemptCount;

    public RacingGame(Cars cars, int count) {
        this.cars = cars;
        this.attemptCount = new AttemptCount(count);
    }

    public Winners start() {
        actions(cars);
        return cars.getWinners();
    }

    private void actions(Cars cars) {
        for (int i = 0; i < attemptCount.getValue(); i++) {
            cars.action();
        }
    }
}
