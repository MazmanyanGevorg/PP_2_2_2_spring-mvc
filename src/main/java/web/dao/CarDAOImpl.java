//package web.dao;
//
//import org.springframework.stereotype.Repository;
//import web.model.Car;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Repository
//public class CarDAOImpl implements CarDAO {
//
//    private static int CAR_COUNT;
//    private final List<Car> cars;
//
//    {
//        cars = new ArrayList<>();
//        cars.add(new Car(++CAR_COUNT, "Ford", 2021, 10000));
//        cars.add(new Car(++CAR_COUNT, "Toyota", 2022, 20000));
//        cars.add(new Car(++CAR_COUNT, "Subaru", 2023, 30000));
//        cars.add(new Car(++CAR_COUNT, "Kia", 2024, 40000));
//        cars.add(new Car(++CAR_COUNT, "Lada", 2025, 50000));
//    }
//
//    @Override
//    public List<Car> getCars(int count) { // count - кол-во возвращенных машин
//        if (count == 0) {
//            return cars;
//        }
//        return cars.stream().limit(count).collect(Collectors.toList());
//    }
//}
