package org.example;

import java.util.LinkedList;
import java.util.List;
/**
 * @author Marko Petric;mp.marko@hotmail.com;3660845;Niklas Werner;niklas.0711@gmax.de;3662733
 * @version 12.01.2023
 */



public abstract class Console {
    private final Integer versionNumber;
    private final ProcessingUnit processingUnit;

    public List<Software> getSoftwareList() {
        return softwareList;
    }

    private final List<Software> softwareList ;




    public Console(Integer versionNumber, ProcessingUnit processingUnit,List<Software> softwareList){

        this.versionNumber = versionNumber;
        this.processingUnit = processingUnit;
        this.softwareList = softwareList;

    }

    /**public void addSoftware(Software software){

        softwareSet.add(software);
    }*/

    public ProcessingUnit getProcessingUnit(){

        return this.processingUnit;
    }




}
