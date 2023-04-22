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

    public int amountSales(long[] sales) {

        int amount = 0;

        for (int i = 0; i < sales.length; i++) {
            amount += sales[i];
        }

        return amount;
    }

    public int averageSalesAmount(long[] sales) {

        return this.amountSales(sales) / sales.length;

    }

    public int belowAverage(long[] sales) {
        int b = this.averageSalesAmount(sales);
        int k = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < b) {
                k = k + 1;
            }

        }
        return k;
    }

    public int aboveAverage(long[] sales) {
        int b = this.averageSalesAmount(sales);
        int k = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > b) {
                k = k + 1;
            }

        }
        return k;
    }
}
