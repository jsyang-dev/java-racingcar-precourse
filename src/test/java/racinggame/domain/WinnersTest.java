package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("우승 자동차 도메인 테스트")
class WinnersTest {

    @Test
    @DisplayName("우승 자동차를 생성한다.")
    void constructor() {
        // given
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");
        car1.action(ActionType.FORWARD);
        car2.action(ActionType.STOP);
        car3.action(ActionType.FORWARD);

        // when
        Winners winners = new Winners(Arrays.asList(car1, car2, car3));

        // then
        assertAll(
                () -> assertThat(winners.getCarCount()).isEqualTo(2),
                () -> assertThat(winners.getCar(0)).isEqualTo(car1),
                () -> assertThat(winners.getCar(1)).isEqualTo(car3)
        );
    }
}
