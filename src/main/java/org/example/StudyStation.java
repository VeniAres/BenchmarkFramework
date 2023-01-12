/**package org.example;

import java.util.HashSet;

public class StudyStation extends Console {
    public StudyStation(Integer versionNumber, ProcessingUnit processingUnit,HashSet<Software> softwareSet) {
        super(versionNumber, processingUnit);
    }

    Console studyStation = new StudyStation(14,new ProcessingUnit("Super",45),
            new HashSet<>(){{
                add(new Software("Linux",49.8));
    }});



}
*/