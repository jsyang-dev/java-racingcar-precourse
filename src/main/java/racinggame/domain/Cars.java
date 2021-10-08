package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static final String DELIMITER = ",";

    private final List<Car> cars;

    public Cars(String nameText) {
        cars = mapCars(nameText);
    }

    public int getSize() {
        return cars.size();
    }

    private List<Car> mapCars(String nameText) {
        List<Car> cars = new ArrayList<>();
        for (String name : nameText.split(DELIMITER)) {
            cars.add(new Car(name));
        }
        return cars;
    }
}
