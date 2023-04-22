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

        int expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minimumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 /*Статистика по месяцам*/
        };

        int expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void allSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        int actual = service.amountSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageAllSalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;
        int actual = service.averageSalesAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 5;
        int actual = service.belowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int expected = 5;
        int actual = service.aboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}