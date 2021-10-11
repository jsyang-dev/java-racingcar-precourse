package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import racinggame.CustomParameterizedTest;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("자동차 도메인 테스트")
class CarTest {

    @CustomParameterizedTest
    @ValueSource(strings = {"a", "abcde", " abcde "})
    @DisplayName("자동차를 생성한다.")
    void constructor(String input) {
        // when
        Car car = new Car(input);

        // then
        assertAll(
                () -> assertThat(car.getCarName()).isEqualTo(input.trim()),
                () -> assertThat(car.getCarPosition()).isEqualTo(0)
        );
    }

    @CustomParameterizedTest
    @ValueSource(strings = {" ", "abcdef"})
    @DisplayName("공백을 제외하고 빈 값이거나 5자 초과된 이름으로 자동차를 생성하면 예외를 발생한다.")
    void constructorException(String input) {
        // when & then
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> new Car(input))
                .withMessageMatching(Message.CAR_NAME_ERROR.getMessage());
    }

    @Test
    @DisplayName("자동차를 움직인다.")
    void action() {
        // given
        Car car = new Car("car1");

        // when
        car.action(ActionType.FORWARD);

        // then
        assertThat(car.getCarPosition()).isEqualTo(1);
    }
}
