package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> allCars = List.of(
            new Car("Audi", 5, "Coupe"),
            new Car("BMW", 5, "Touring"),
            new Car("Volvo", 940, "Sedan"),
            new Car("Tesla", 3, "Sedan"),
            new Car("Mercedes", 320, "Coupe")
    );

    @Override
    public List<Car> getCars(int count) {
        return ((count <= 5) && (count > 0)) ? allCars.subList(0, count) : allCars;
    }
}
