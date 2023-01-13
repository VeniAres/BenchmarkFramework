package console;

/**
 * @author Marko Petric;mp.marko@hotmail.com;3660845;Niklas Werner;niklas.0711@gmax.de;3662733
 * @version 13.01.2023
 */



public class ProcessingUnit {

    private String name;
    private Double performance;


    /**
     * creates a new ProcessingUnit object with given name and performance
     * @param name of the ProcessingUnit
     * @param performance of the ProcessingUnit
     */
    public ProcessingUnit(String name, Double performance) {
        this.name = name;
        this.performance = performance;

        if (performance < 1.0 || performance > 50.0) {
            throw new IllegalArgumentException("The consumption has to be between 1.0 and 50.0!");
        }

    }

    /**
     * returns the performance of the ProcessingUnit
     * @return performance of the ProcessingUnit
     */
    public Double getPerformance() {
        return performance;
    }


}
