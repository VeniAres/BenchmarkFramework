package console;

import framework.Producer;

import java.util.List;

/**
 * @author Marko Petric;mp.marko@hotmail.com;3660845;Niklas Werner;niklas.0711@gmax.de;3662733
 * @version 13.01.2023
 */

public abstract class Console {
    private final Integer versionNumber;
    private final ProcessingUnit processingUnit;
    private final List<Software> softwareList;


    /**
     * creates a new Console object with given versionNumber,processingUnit,softwareList
     * @param versionNumber of the console
     * @param processingUnit of the console
     * @param softwareList of the console
     */
    public Console(final Integer versionNumber, final ProcessingUnit processingUnit, final List<Software> softwareList) {

        this.versionNumber = versionNumber;
        this.processingUnit = processingUnit;
        this.softwareList = softwareList;

    }

    /**
     * returns the processingUnit
     * @return processingUnit
     */
    public ProcessingUnit getProcessingUnit() {

        return this.processingUnit;
    }

    /**
     * returns the List softwareList
     * @return softwareList
     */
    public List<Software> getSoftwareList() {

        return softwareList;
    }

    /**
     * abstract method for inheritor
     */
    public abstract Producer getProducer();

}
