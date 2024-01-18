import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class FindLowestListTest {
    @DisplayName("findLowest Test 01")
    @Test
    void findLowest_Test01() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5); a.add(2); a.add(100); a.add(3); a.add(8); 
        int expected = 2;
        int result = SelectionSearch.findLowest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findLowest Test 02")
    @Test
    void findLowest_Test02() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(30); a.add(15); a.add(20); a.add(10); 
        int expected = 10;
        int result = SelectionSearch.findLowest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findLowest Test 03")
    @Test
    void findLowest_Test03() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2); a.add(29); a.add(3); a.add(20); a.add(1); a.add(34); 
        int expected = 1;
        int result = SelectionSearch.findLowest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findLowest Test 04")
    @Test
    void findLowest_Test04() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5); a.add(2); a.add(100); a.add(3); a.add(8); a.add(125); 
        a.add(2048); a.add(0); a.add(1); a.add(7); a.add(2); a.add(100); 
        a.add(1000); a.add(500); a.add(27); 
        int expected = 0;
        int result = SelectionSearch.findLowest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findLowest Test 05")
    @Test
    void findLowest_Test05() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5); a.add(2); a.add(100); a.add(3); a.add(8); a.add(125); 
        a.add(7); a.add(2); a.add(100); a.add(1000); a.add(500); a.add(27); 
        int expected = 2;
        int result = SelectionSearch.findLowest(a);
        assertEquals(expected, result);
    }

    @DisplayName("findLowest Test 06")
    @Test
    void findLowest_Test06() {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5); a.add(256); a.add(100); a.add(3); a.add(8); a.add(125); 
        a.add(7); a.add(50); a.add(2); 
        int expected = 2;
        int result = SelectionSearch.findLowest(a);
        assertEquals(expected, result);
    }
}
