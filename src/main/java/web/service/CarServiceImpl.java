package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import web.dao.CarDAO;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    private CarDAO carDAO;
    private CarService carService;

    @Autowired
    public void setCarDAO(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> getCars(int count) {
        return carDAO.getCars(count);
    }
}
