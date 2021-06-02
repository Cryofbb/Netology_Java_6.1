package ru.netology.yearlysales;

public class YearlySales {
    public long calculateAll(long[] salesForYear) { // Получаем сумму по массиву
        long sum = 0;
        for (long sale : salesForYear){
        sum += sale;
        }
        return sum;
    }
    public long calculateAverage(long[] salesForYear) { // Получаем среднее значение по массиву
        return calculateAll(salesForYear) / salesForYear.length;
    }
    public long calculateBest(long[] salesForYear) { // Наибольшее значение по массиву
        int minMonth = 0;
        int month = 0;
        for (long sale : salesForYear) {
            if (sale >= salesForYear[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int calculateWorst(long[] salesForYear) {
        int minMonth = 0;
        int month = 0;
        for (long sale : salesForYear) {
            if (sale <= salesForYear[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int calculateBetterThanAverage(long[] salesForYear) { // Кол-во месяцев выше среднего
        int count = 0;
        for (long saleForYear : salesForYear){
            if (calculateAverage(salesForYear) < saleForYear) {
                count += 1;
            }
        }
        return count;
    }
    public int calculateWorseThanAverage(long[] salesForYear) { // Кол-во месяцев ниже среднего
        int count = 0;
        for (long saleForYear : salesForYear){
            if (calculateAverage(salesForYear) > saleForYear) {
                count += 1;
            }
        }
        return count;
    }
}
