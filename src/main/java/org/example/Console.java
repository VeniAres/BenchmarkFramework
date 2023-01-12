package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public abstract class Console {
    private final Integer versionNumber;
    private final ProcessingUnit processingUnit;

    private List<Software> softwareSet = new LinkedList<>();


    public Console(Integer versionNumber, ProcessingUnit processingUnit,List<Software> softwareSet){

        this.versionNumber = versionNumber;
        this.processingUnit = processingUnit;
        this.softwareSet = softwareSet;

    }

    /**public void addSoftware(Software software){

        softwareSet.add(software);
    }*/

    public int getVersionNumber(){

        return this.versionNumber;
    }

    public List<Software> getSoftwareSet(){
        return this.softwareSet;
    }


}
