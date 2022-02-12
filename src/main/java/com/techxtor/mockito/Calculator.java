package com.techxtor.mockito;

public class Calculator {
    CalculatorService service;

    public Calculator(CalculatorService service) {
        this.service = service;
    }

    public int performServiceAdd(int i, int j) {
//        int serviceResponse = i + j;
        int serviceResponse = service.add(i, j);
        return serviceResponse * i;
    }
}
