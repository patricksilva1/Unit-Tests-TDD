package dev.patricksilva.firstexampletdd.model;

public class SalesComission {

    // Simple Example to test
    public double calculate(double saleValue) {
        return (saleValue < 1000.0) ? saleValue * 0.1 : saleValue * 0.15;
    }

}
