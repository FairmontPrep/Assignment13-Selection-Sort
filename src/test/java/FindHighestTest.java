import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FindHighestTest {

    @DisplayName("findHighest Test 01")
    @Test
    void findHighest_Test01() {
        int[] a = {5, 2, 100, 3, 8};
        int expected = 100;
        int result = SelectionSearch.findHighest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findHighest Test 02")
    @Test
    void findHighest_Test02() {
        int[] a = {30, 15, 20, 10};
        int expected = 30;
        int result = SelectionSearch.findHighest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findHighest Test 03")
    @Test
    void findHighest_Test03() {
        int[] a = {2, 29, 3, 20, 1, 34};
        int expected = 34;
        int result = SelectionSearch.findHighest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findHighest Test 04")
    @Test
    void findHighest_Test04() {
        int[] a = {5, 2, 100, 3, 8, 125, 2048, 0, 1, 7, 2, 100, 1000, 500, 27};
        int expected = 2048;
        int result = SelectionSearch.findHighest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findHighest Test 05")
    @Test
    void findHighest_Test05() {
        int[] a = {5, 2, 100, 3, 8, 125, 7, 2, 100, 1000, 500, 27};
        int expected = 1000;
        int result = SelectionSearch.findHighest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findHighest Test 06")
    @Test
    void findHighest_Test06() {
        int[] a = {5, 256, 100, 3, 8, 125, 0, 1, 7, 50, 27};
        int expected = 256;
        int result = SelectionSearch.findHighest(a);
        assertEquals(expected, result);
    }
}
