package racinggame.domain;

import nextstep.utils.Randoms;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import racinggame.CustomParameterizedTest;

import static org.assertj.core.api.Assertions.*;

@DisplayName("자동차 행동 도메인 테스트")
class CarActionTest {

    @CustomParameterizedTest
    @CsvSource(value = {"0:STOP", "3:STOP", "4:FORWARD", "9:FORWARD"}, delimiter = ':')
    @DisplayName("자동차 행동 유형을 구한다.")
    void getActionType(int input, ActionType expected) {
        try (MockedStatic<Randoms> mockedStatic = Mockito.mockStatic(Randoms.class)) {
            // given
            mockedStatic.when(() -> Randoms.pickNumberInRange(CarAction.MIN_OF_RANGE, CarAction.MAX_OF_RANGE))
                    .thenReturn(input);

            // when
            ActionType actionType = CarAction.getActionType();

            // then
            assertThat(actionType).isEqualTo(expected);
        }
    }
}
