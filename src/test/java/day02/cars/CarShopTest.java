package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarShopTest {

    CarShop carShop = new CarShop("Bombi", 1001);

    @BeforeEach
    void init() {
        carShop.addCar(new Car("Nissan", 5.5, Color.BLUE, 1000));
        carShop.addCar(new Car("Nissan", 4.5, Color.BLUE, 900));
        carShop.addCar(new Car("Nissan", 3.5, Color.BLUE, 800));
    }

    @Test
    void creatorCarShop() {

        assertEquals("Bombi", carShop.getDealerName());
        assertEquals(1001, carShop.getPriceMax());
        assertEquals(3, carShop.getCarsForSell().size());
    }

    @Test
    void addCarWithValidPriceTest() {

        boolean result = carShop.addCar((new Car("Nissan", 5.5, Color.BLUE, 1000)));

        assertTrue(result);
        assertEquals(4, carShop.getCarsForSell().size());
        assertEquals("Nissan", carShop.getCarsForSell().get(0).getBrand());
    }

    @Test
    void addCarWithInvalidPriceTest() {

        boolean result = carShop.addCar((new Car("Nissan", 5.5, Color.BLUE, 1000)));

        assertTrue(result);
        assertEquals(4, carShop.getCarsForSell().size());
    }

    @Test
    void sumPriceOfCarsTest() {
        assertEquals(2700, carShop.sumCarPrice());
    }
}
