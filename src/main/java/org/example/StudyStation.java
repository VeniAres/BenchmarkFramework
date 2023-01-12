package org.example;

import java.util.List;

public class StudyStation extends Console{
    public StudyStation(List<Software> softwareList) {
        super(1,new ProcessingUnit("PansomyCPU",25.0), softwareList);
    }




}
