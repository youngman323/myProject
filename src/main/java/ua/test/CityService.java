package ua.test;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService {

    @Override
    public List<City> findAll() {

        List<City> cities = new ArrayList<City>();

        cities.add(new City(1L, "kiev", 2868702));
        cities.add(new City(2L, "Kharkov", 1451132));
        cities.add(new City(3L, "Odessa", 1017022));
        cities.add(new City(4L, "Dnipro", 993094));
        cities.add(new City(5L, "Donetsk", 949825));
        cities.add(new City(6L, "Lviv", 729038));
        cities.add(new City(7L, "Ivano-Frankivsk", 227030));
        cities.add(new City(8L, "Sumy", 268874));

        return cities;
    }
}