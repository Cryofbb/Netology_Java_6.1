package ru.netology.yearlysales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class YearlySalesTest {
    @Test
    void allYearlySalesSum() {
         YearlySales service = new YearlySales();
         long[] salesForYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
         long actual = service.calculateAll(salesForYear);
         long expected = 180;
         assertEquals(expected, actual);
    }
    @Test
    void allYearlySalesAverage() {
        YearlySales service = new YearlySales();
        long[] salesForYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateAverage(salesForYear);
        long expected = 15;
        assertEquals(expected, actual);
    }
    @Test
    void allYearlySalesMax() { // Нужен номер месяца
        YearlySales service = new YearlySales();
        long[] salesForYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateBest(salesForYear);
        long expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    void allYearlySalesMin() {
        YearlySales service = new YearlySales();
        long[] salesForYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateWorst(salesForYear);
        long expected = 9;
        assertEquals(expected, actual);
    }
    @Test
    void allYearlySalesBetterThanAverage() {
        YearlySales service = new YearlySales();
        long[] salesForYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateBetterThanAverage(salesForYear);
        long expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    void allYearlySalesWorseThanAverage() {
        YearlySales service = new YearlySales();
        long[] salesForYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.calculateWorseThanAverage(salesForYear);
        long expected = 5;
        assertEquals(expected, actual);
    }
}
