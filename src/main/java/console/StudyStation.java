package console;

import framework.Producer;
import java.util.List;


/**
 * @author Marko Petric;mp.marko@hotmail.com;3660845;Niklas Werner;niklas.0711@gmax.de;3662733
 * @version 13.01.2023
 */


public class StudyStation extends Console{


    /**
     * creates a StudyStation object with given List
     * @param softwareList a List of Software objects
     */
    public StudyStation(final List<Software> softwareList) {
        super(1,new ProcessingUnit("PansomyCPU",25.0), softwareList);
    }


    private final Producer producer = new Producer("Pansomy");


    /**
     * returns the producer of the StudyStation
     * @return producer
     */
    @Override
    public Producer getProducer(){

        return producer;
    }


}
