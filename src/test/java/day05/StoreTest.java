package day05;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    public Store store = new Store();

    @BeforeEach
    void setUp() {
    store.addProduct(new Product("Milk", Type.DIARY, 0.7));
    store.addProduct(new Product("Butter", Type.DIARY, 2.3));
    }

     @Test
    void testNumberOfProductsByType() {
        List<ProductWithPiece> result = store.numberOfProductsByType();

        assertEquals(1, result.size());
        assertEquals(Type.DIARY, result.get(0).getType());
        assertEquals(2, result.get(0).getCount());
    }

      @Test
    void testNull() {
        Store anotherStore = null;

        assertNotNull(store);
        assertNull(anotherStore);
    }

    @Test
    void testSameObjects() {
        Store anotherStore = store;

        assertSame(store, anotherStore);
    }

//
//    @Test
//    void testNotSameObjects() {
//        Ship anotherShip = new Ship("San Felipe", 1765, 80.0);
//
//        assertNotSame(ship, anotherShip);
//    }
//    @Test
//    void testGetWordsWithLength() {
//        List<String> reply = Arrays.asList("kettő", "három");
//        words.getWordsWithLength(5);
//
//        assertEquals(reply, words.getWords());
//    }
}