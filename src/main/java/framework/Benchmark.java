package framework;

import console.Console;
import console.Software;

/**
 * @author Marko Petric;mp.marko@hotmail.com;3660845;Niklas Werner;niklas.0711@gmax.de;3662733
 * @version 13.01.2023
 */



public class Benchmark {


    /**
     *a method that calculates the benchmark value
     * @param softwareTitle is a softwareTitle
     * @param console is a console
     * @return benchmark value
     */
    public Double executeBenchMark(final String softwareTitle,final Console console) {
        for (Software software : console.getSoftwareList()) {

            if (software.getTitle().equals(softwareTitle)) {
                return console.getProcessingUnit().getPerformance() / software.getConsumption();

            }
        }
        throw new RuntimeException("software title " + softwareTitle + " is not installed on console.");

    }

}
