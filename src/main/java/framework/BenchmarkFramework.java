package framework;

import console.Console;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Marko Petric;mp.marko@hotmail.com;3660845;Niklas Werner;niklas.0711@gmax.de;3662733
 * @version 13.01.2023
 */


public class BenchmarkFramework {

    private Benchmark benchmark;
    private Console console;
    private final List<String> softwareTitlesToTest = new ArrayList<String>();


    /**
     * constructor of a BenchmarkFramework
     * @param benchmark is a benchmark
     */
    public  BenchmarkFramework(final Benchmark benchmark) {

        this.benchmark = benchmark;
    }


    /**
     * sets a console
     * @param console is a Console object
     */
    public void setConsole(final Console console){

        this.console = console;
    }

    /**
     *
     * @param title of a software
     */
    public void addSoftwareTitleForBenchmark(final String title){

        softwareTitlesToTest.add(title);
    }

    /**
     *
     */
    public void run(){

        for (String title:softwareTitlesToTest){
            Double performance = benchmark.executeBenchMark(title,console);
            System.out.println("performance of the Console is "+ performance + " of the " + title + " Software");
        }
    }


}
