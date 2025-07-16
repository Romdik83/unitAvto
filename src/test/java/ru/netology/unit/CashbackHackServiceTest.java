package ru.netology.unit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CashbackHackServiceTest {

    @Test
    public void whenBuyingAt900TheSystemOffersToBuyAnother100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual= service.remain(amount);
        int expected=100;
        assertEquals(expected, actual);
    }

    @Test
    public void whenBuyingAt800TheSystemOffersToBuyAnother200() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int actual= service.remain(amount);
        int expected=200;
        assertEquals(expected, actual);
    }

    @Test
    public void whenBuyingAt1900TheSystemOffersToBuyAnother100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1900;
        int actual= service.remain(amount);
        int expected=100;
        assertEquals(expected, actual);
    }

    @Test
    public void whenBuyingAt1800TheSystemOffersToBuyAnother200() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1800;
        int actual= service.remain(amount);
        int expected=200;
        assertEquals(expected, actual);
      }
    }