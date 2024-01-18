import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FindLowestTest {
    @DisplayName("findLowest Test 01")
    @Test
    void findLowest_Test01() {
        int[] a = {5, 2, 100, 3, 8};
        int expected = 2;
        int result = SelectionSearch.findLowest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findLowest Test 02")
    @Test
    void findLowest_Test02() {
        int[] a = {30, 15, 20, 10};
        int expected = 10;
        int result = SelectionSearch.findLowest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findLowest Test 03")
    @Test
    void findLowest_Test03() {
        int[] a = {2, 29, 3, 20, 1, 34};
        int expected = 1;
        int result = SelectionSearch.findLowest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findLowest Test 04")
    @Test
    void findLowest_Test04() {
        int[] a = {5, 2, 100, 3, 8, 125, 2048, 0, 1, 7, 2, 100, 1000, 500, 27};
        int expected = 0;
        int result = SelectionSearch.findLowest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findLowest Test 05")
    @Test
    void findLowest_Test05() {
        int[] a = {1, 2, 100, 3, 8, 125, 7, 2, 100, 1000, 500, 27};
        int expected = 1;
        int result = SelectionSearch.findLowest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findLowest Test 06")
    @Test
    void findLowest_Test06() {
        int[] a = {5, 256, 100, 3, 8, 125, 7, 50, 2};
        int expected = 2;
        int result = SelectionSearch.findLowest(a);
        assertEquals(expected, result);
    }
}
