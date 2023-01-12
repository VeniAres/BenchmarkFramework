package org.example;

import java.util.List;

public class LearnDitch extends Console {


    public LearnDitch(List<Software> softwareList) {
        super(2, new ProcessingUnit("NindanCPU",30.0), softwareList);
    }
}
