package racinggame.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("자동차 세트 도메인 테스트")
public class CarsTest {

    @Test
    @DisplayName("자동차 세트를 생성한다.")
    void constructor() {
        // when
        Cars cars = new Cars("car1,car2,car3");

        // then
        assertThat(cars.getSize()).isEqualTo(3);
    }
}
