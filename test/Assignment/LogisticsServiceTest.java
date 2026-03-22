package Assignment;

import Day3.Assignment.LogisticsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogisticsServiceTest {

    @Test
    public void testlessthan50_successfullDelivery() {
        int successfulDelivery = 25;
        int totalPay = LogisticsService.calculatePay(successfulDelivery);
        assertEquals(9000, totalPay);
    }

    @Test
    public void test50to59_successfullDelivery() {
        int successfulDelivery = 55;
        int totalPay = LogisticsService.calculatePay(successfulDelivery);
        assertEquals(16000, totalPay);
    }

    @Test
    public void test60to69_successfullDelivery() {
        int successfulDelivery = 65;
        int totalPay = LogisticsService.calculatePay(successfulDelivery);
        assertEquals(21250, totalPay);
    }

    @Test
    public void testgreaterthan69_successfullDelivery() {
        int successfulDelivery = 75;
        int totalPay = LogisticsService.calculatePay(successfulDelivery);
        assertEquals(42500, totalPay);
    }

}
