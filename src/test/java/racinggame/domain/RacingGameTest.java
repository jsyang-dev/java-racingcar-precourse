package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("경주 게임 도메인 테스트")
class RacingGameTest {

    @Test
    @DisplayName("경주 게임을 생성한다.")
    void constructor() {
        // when
        RacingGame racingGame = new RacingGame(1);

        // then
        assertThat(racingGame).isNotNull();
    }

    @Test
    @DisplayName("1 미만의 시도 횟수로 경주 게임을 생성하면 예외를 발생한다.")
    void constructorException() {
        // when & then
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new RacingGame(0))
                .withMessageMatching("시도 횟수는 1 이상으로 입력해야 합니다.");
    }
}
