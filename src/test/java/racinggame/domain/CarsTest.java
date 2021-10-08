package racinggame.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("자동차 세트 도메인 테스트")
class CarsTest {

    private Cars cars;

    @BeforeEach
    void setUp() {
        cars = new Cars("car1,car2,car3");
    }

    @Test
    @DisplayName("자동차 세트를 생성한다.")
    void constructor() {
        assertThat(cars.getCarCount()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차들의 행동을 결정한다.")
    void action() {
        try (MockedStatic<CarAction> mockedStatic = Mockito.mockStatic(CarAction.class)) {
            // given
            mockedStatic.when(CarAction::getActionType).thenReturn(ActionType.FORWARD);

            // when
            cars.action();

            // then
            assertAll(
                    () -> assertThat(cars.getCar(0).getCarPosition()).isEqualTo(1),
                    () -> assertThat(cars.getCar(1).getCarPosition()).isEqualTo(1),
                    () -> assertThat(cars.getCar(2).getCarPosition()).isEqualTo(1)
            );
        }
    }

    @Test
    @DisplayName("자동차 경주 우승 자동차를 조회한다.")
    void getWinners() {
        // given
        cars.action();

        // when
        Winners winners = cars.getWinners();

        // then
        assertThat(winners.getCarCount()).isGreaterThan(0).isLessThanOrEqualTo(cars.getCarCount());
    }
}
