package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static final String DELIMITER = ",";

    private final List<Car> cars;

    public Cars(String nameText) {
        cars = mapCars(nameText);
    }

    public Car getCar(int index) {
        return cars.get(index);
    }

    public int getCarCount() {
        return cars.size();
    }

    public void action() {
        for (Car car : cars) {
            car.action(CarAction.getActionType());
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
