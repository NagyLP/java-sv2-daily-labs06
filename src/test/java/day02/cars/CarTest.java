package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void createCarTest() {

        Car car = new Car("Nissan", 5.5, Color.BLUE, 1000);

                assertEquals("Nissan", car.getBrand());
                assertEquals(5.5, car.getEngineSize());
                assertEquals(Color.BLUE, car.getColor());
                assertEquals(1000, car.getPrice());
    }

    @Test
    void decreasePriceTest() {
        Car car = new Car("Nissan", 5.5, Color.BLUE, 1000);

        car.decreasePrice(10);
        assertEquals(900, car.getPrice());
    }
}
