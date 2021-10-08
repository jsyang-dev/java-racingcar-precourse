package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Winners {
    
    private final List<Car> cars;

    public Winners(List<Car> candidateCars) {
        cars = new ArrayList<>();
        findWinners(candidateCars);
    }

    Car getCar(int index) {
        return cars.get(index);
    }

    public int getCarCount() {
        return cars.size();
    }

    public int getPosition() {
        return cars.get(0).getCarPosition();
    }

    private void findWinners(List<Car> candidateCars) {
        for (Car candidateCar : candidateCars) {
            addCandidate(candidateCar);
        }
    }

    private void addCandidate(Car candidateCar) {
        if (cars.isEmpty()) {
            cars.add(candidateCar);
            return;
        }
        if (candidateCar.isBehindPosition(this)) {
            return;
        }

        if (candidateCar.isAheadPosition(this)) {
            cars.clear();
        }
        cars.add(candidateCar);
    }
}
