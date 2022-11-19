package dev.patricksilva.firstexampletdd.model;

public class SalesComission {

    public double calculate(double saleValue) {
        return (saleValue < 1000.0) ? saleValue * 0.1 : saleValue * 0.15;
    }

}
