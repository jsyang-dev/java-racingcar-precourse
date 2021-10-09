package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static final String DELIMITER = ",";

    private final List<Car> cars;

    public Cars(String names) {
        verifyNames(names);
        cars = mapCars(names);
    }

    Car getCar(int index) {
        return cars.get(index);
    }

    public int getCarCount() {
        return cars.size();
    }

    public Winners getWinners() {
        return new Winners(cars);
    }

    public void action() {
        for (Car car : cars) {
            car.action(CarAction.getActionType());
        }
    }

    private void verifyNames(String names) {
        if (!names.matches("([\\w]+,)*([\\w]+,[\\w]+)")) {
            throw new IllegalArgumentException("유효한 이름으로 2개 이상 입력해야 합니다.");
        }
    }

    private List<Car> mapCars(String nameText) {
        List<Car> cars = new ArrayList<>();
        for (String name : nameText.split(DELIMITER)) {
            cars.add(new Car(name));
        }
        return cars;
    }
}
