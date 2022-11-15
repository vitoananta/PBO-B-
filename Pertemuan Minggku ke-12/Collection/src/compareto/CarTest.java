package compareto;

import java.util.ArrayList;
import java.util.Collections;

public class CarTest {
    public static void main(String[] agrs){
        ArrayList<Car> carNames = new ArrayList<>();

        addCars(carNames);
        System.out.println("Before sort:");
        displayCars(carNames);
        Collections.sort(carNames);
        System.out.println("After sort:");
        displayCars(carNames);
    }

    static void displayCars(ArrayList<Car> carNames){
        for(Car car: carNames){
            System.out.println(car);
        }
    }

    static void addCars(ArrayList<Car> carNames){
        carNames.add(new Car("F1", "McLaren", 240));
        carNames.add(new Car("Huayra", "Pagani", 238));
        carNames.add(new Car("Jesko", "Koenigsegg", 278));
    }
}
