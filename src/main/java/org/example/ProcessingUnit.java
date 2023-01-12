package org.example;

public class ProcessingUnit {

    private String name;


    private  Double performance;

    public ProcessingUnit(String name,Double performance){
        this.name = name;
        this.performance = performance;

    }

    public Double getPerformance() {
        return performance;
    }

}
