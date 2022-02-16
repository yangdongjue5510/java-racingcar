package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.util.BoundedRandomNumberGenerator;

@SuppressWarnings("NonAsciiCharacters")
public class CarTest {

    @Test
    public void 자동차_멈춤_테스트() {
        Car car = new Car("클레이");
        assertThat(car.isMovableBy(new BoundedRandomNumberGenerator(3, 0))).isEqualTo(false);
    }

    @Test
    public void 자동차_전진_테스트() {
        Car car = new Car("클레이");
        assertThat(car.isMovableBy(new BoundedRandomNumberGenerator(9, 4))).isEqualTo(true);
    }
}
