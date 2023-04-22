package ru.netology.stats.SalesStatistic.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.SalesStatistics.test.data.StatsService;


public class StatsServiceTest {

    @Test
    public void maximumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18/*Статистика по месяцам*/
        };

        int expectedMonthHighSales = 8;
        long actualMonthHighSales = service.maxSales(sales);
        Assertions.assertEquals(expectedMonthHighSales, actualMonthHighSales);

    }

    @Test
    public void minimumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 /*Статистика по месяцам*/
        };

        int expectedMonthLowSales = 9;
        long actualMonthLowSales = service.minSales(sales);
        Assertions.assertEquals(expectedMonthLowSales, actualMonthLowSales);

    }


    @Test
    public void allSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAmount = 180;
        int actualAmount = service.totalOfAllSales(sales);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void averageAllSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expectedAverageAmount = 15;
        int actualAverageAmount = service.averageSalesAmount(sales);
        Assertions.assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    public void belowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedMonthsBelowAverage = 5;
        int actualMonthsBelowAverage = service.belowAverage(sales);
        Assertions.assertEquals(expectedMonthsBelowAverage, actualMonthsBelowAverage);
    }

    @Test
    public void aboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expectedMonthsAboveAverage = 5;
        int actualMonthsAboveAverage = service.aboveAverage(sales);
        Assertions.assertEquals(expectedMonthsAboveAverage, actualMonthsAboveAverage);
    }
}