package ru.netology.javaqa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CashBackHackerTest {
    @Test
    public void boundaryValue1() {
        CashBackHacker service = new CashBackHacker();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void boundaryValue2() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void boundaryValue3() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void boundaryValue4() {
        CashBackHacker service = new CashBackHacker();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        CashBackHacker service = new CashBackHacker();
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }
    
}