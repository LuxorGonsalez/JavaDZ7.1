import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

public class StatsServiceTest {

    @Test
    public void test() {
        StatsService service = new StatsService();
        long[] sales = {12, 15, 13, 15, 17, 16, 19, 20, 7, 14, 14, 18};


        long actual = service.sum(sales);
        long expected = 12 + 15 + 13 + 15 + 17 + 16 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        StatsService service = new StatsService();
        long[] sales = {12, 15, 13, 15, 17, 16, 19, 20, 7, 14, 14, 18};


        long actual = service.average(sales);
        long expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        StatsService service = new StatsService();
        long[] sales = {12, 15, 13, 15, 17, 16, 19, 20, 7, 14, 14, 18};


        int actual = service.countBelowAvg(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        StatsService service = new StatsService();
        long[] sales = {12, 15, 13, 15, 17, 16, 19, 20, 7, 14, 14, 18};


        int actual = service.countHigherAvg(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        StatsService service = new StatsService();
        long[] sales = {12, 15, 13, 15, 17, 16, 19, 20, 7, 14, 14, 18};


        int actual = service.minSales(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        StatsService service = new StatsService();
        long[] sales = {12, 15, 13, 15, 17, 16, 19, 20, 7, 14, 14, 18};


        int actual = service.maxSales(sales);
        long expected = 8;

        assertEquals(expected, actual);
    }


}


