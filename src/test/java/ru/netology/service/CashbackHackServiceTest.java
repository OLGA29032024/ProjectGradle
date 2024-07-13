package ru.netology.service;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    @org.junit.Test
    public void testRamain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testRamainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(expected, actual);

    }
}
