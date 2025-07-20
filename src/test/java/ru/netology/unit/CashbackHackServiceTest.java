package ru.netology.unit;

//import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {

    @Test
    void whenBuyingAt900TheSystemOffersToBuyAnother100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    void whenBuyingAt800TheSystemOffersToBuyAnother200() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);
    }

    @Test
    void whenBuyingFor1000TheSystemDoesNotOfferAnything() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void whenBuyingFor1100TheSystemDoesNotOfferAnything() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void whenBuyingAt1900TheSystemOffersToBuyAnother100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    void whenBuyingAt1800TheSystemOffersToBuyAnother200() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);
    }
}