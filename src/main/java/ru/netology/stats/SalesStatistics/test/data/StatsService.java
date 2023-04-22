package ru.netology.stats.SalesStatistics.test.data;

public class StatsService {
    public int minSales(long[] sales) {

        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {

        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int totalOfAllSales(long[] sales) {

        int allAmount = 0;

        for (int i = 0; i < sales.length; i++) {
            allAmount += sales[i];
        }

        return allAmount;
    }

    public int averageSalesAmount(long[] sales) {

        return this.totalOfAllSales(sales) / sales.length;

    }

    public int belowAverage(long[] sales) {
        int averageAmount = this.averageSalesAmount(sales);
        int numberOfSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {
                numberOfSales = numberOfSales + 1;
            }

        }
        return numberOfSales;
    }

    public int aboveAverage(long[] sales) {
        int averageAmount = this.averageSalesAmount(sales);
        int numberOfSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount) {
                numberOfSales = numberOfSales + 1;
            }

        }
        return numberOfSales;
    }
}
