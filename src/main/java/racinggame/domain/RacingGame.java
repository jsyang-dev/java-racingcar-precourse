package racinggame.domain;

public class RacingGame {

    private final AttemptCount attemptCount;

    public RacingGame(int count) {
        this.attemptCount = new AttemptCount(count);
    }
}
