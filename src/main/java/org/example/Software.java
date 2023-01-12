package org.example;

public class Software {

    private String title;
    private Double consumption;

    public Software(String title, Double consumption) {
        this.title = title;
        this.consumption = consumption;
    }

    public String getTitle() {
        return this.title;
    }

    public Double getConsumption() {
        return this.consumption;
    }


}
