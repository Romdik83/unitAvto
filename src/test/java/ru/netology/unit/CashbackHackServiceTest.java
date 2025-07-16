package ru.netology.unit;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//import org.testng.annotations.Test;
//import static org.testng.Assert.assertEquals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void whenBuyingAt900TheSystemOffersToBuyAnother100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual= service.remain(amount);
        int expected=100;
        assertEquals(actual, expected);
    }
}