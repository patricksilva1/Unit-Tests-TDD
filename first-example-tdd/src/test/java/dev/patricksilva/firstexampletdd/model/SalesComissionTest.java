package dev.patricksilva.firstexampletdd.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootTest
public class SalesComissionTest {

    /**
     * @return Sales under a thousand dollars will generate 10% commission.
     * @return Sales above a thousand dollars will receive a commission of 15%.
     * @param Here we to need use the AAA (Arrange, Act and Assert) for the unit test
     */

    @Autowired
    SalesComission salesComission;

    @TestConfiguration
    static class CommissionConfiguration {
        @Bean
        public SalesComission salesComission() {
            return new SalesComission();
        }
    }

    @Test
    // Snake Case (refers to the style of writing)
    public void must_calculate_20_dollars_of_commission_for_sale_of_200() {
        // Arrange
        double saleValue = 200.00;
        double expectedCommission = 2222220.0;

        // Act
        double calculatedCommission = salesComission.calculate(saleValue);

        // Assert
        Assertions.assertEquals(expectedCommission, calculatedCommission);
    }

}
