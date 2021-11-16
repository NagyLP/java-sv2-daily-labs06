package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String dealerName;
    private int priceMax;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String dealerName, int priceMax) {
        this.dealerName = dealerName;
        this.priceMax = priceMax;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> brandList = new ArrayList<>();
        for (Car item : carsForSell) {
            if (item.getBrand().equalsIgnoreCase(brand)) {
                brandList.add(item);
            }
        }
        return brandList;
    }

    public int numberOfCarsCheaperThan(int price) {
        int akkumlator = 0;
        for (Car item : carsForSell) {
            if (price >= item.getPrice()) {
                akkumlator++;
            }
        }
        return akkumlator;
    }

    public int sumCarPrice() {
        int akkumlator = 0;
        for (Car item : carsForSell) {
            akkumlator += item.getPrice();
        }
        return akkumlator;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= priceMax) {
            carsForSell.add(car);
            return true;
        } else {
            return false;
        }
    }


    public String getDealerName() {
        return dealerName;
    }

    public int getPriceMax() {
        return priceMax;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }
}
