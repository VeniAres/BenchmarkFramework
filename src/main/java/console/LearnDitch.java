package console;

import framework.Producer;

import java.util.List;

/**
 * @author Marko Petric;mp.marko@hotmail.com;3660845;Niklas Werner;niklas.0711@gmax.de;3662733
 * @version 13.01.2023
 */



public class LearnDitch extends Console {

    /**
     * creates a new LearnDitch object with given List
     * @param softwareList
     */
    public LearnDitch(final List<Software> softwareList) {
        super(2, new ProcessingUnit("NindanCPU",30.0), softwareList);
    }


    private final Producer producer = new Producer("Nindandolo");

    /**
     * returns the producer-(name)
     * @return producer
     */
    @Override
    public Producer getProducer() {
        return producer;
    }
}
