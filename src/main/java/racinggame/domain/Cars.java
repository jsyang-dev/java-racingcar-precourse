package racinggame.domain;

import racinggame.ui.ConsoleView;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static final String DELIMITER = ",";
    private static final String PROGRESS_BAR = "-";

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
            printProgress(car);
        }
        ConsoleView.newLine();
    }

    private void verifyNames(String names) {
        if (isCommaSeparatedName(names)) {
            throw new IllegalArgumentException(Message.CARS_ERROR.getMessage());
        }
    }

    private boolean isCommaSeparatedName(String names) {
        return !names.matches("([\\w]+,)*([\\w]+,[\\w]+)");
    }

    private List<Car> mapCars(String nameText) {
        List<Car> cars = new ArrayList<>();
        for (String name : nameText.split(DELIMITER)) {
            cars.add(new Car(name));
        }
        return cars;
    }

    private void printProgress(Car car) {
        ConsoleView.printMessage("%s : %s%n", car.getCarName(), getProgress(car));
    }

    private String getProgress(Car car) {
        StringBuilder progress = new StringBuilder();
        for (int i = 0; i < car.getCarPosition(); i++) {
            progress.append(PROGRESS_BAR);
        }
        return progress.toString();
    }
}
