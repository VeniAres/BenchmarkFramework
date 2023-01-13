package framework;

import console.LearnDitch;
import console.Software;
import console.StudyStation;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Marko Petric;mp.marko@hotmail.com;3660845;Niklas Werner;niklas.0711@gmax.de;3662733
 * @version 13.01.2023
 */

public class Producer {

    private final String corporateName;


    /**
     * constructor for a Producer
     * @param corporateName name of the Producer
     */
    public Producer(String corporateName){

        this.corporateName = corporateName;
    }



    public static void main(String[] args) {

        List<Software> availableSoftware = new ArrayList<Software>();

        StudyStation studyStation = new StudyStation(availableSoftware);

        LearnDitch learnDitch = new LearnDitch(availableSoftware);

        BenchmarkFramework benchmarkFramework = new BenchmarkFramework(new Benchmark());



        //initialize new software
        Software t1 = new Software("T1", 13.0);

        Software t2 = new Software("T2", 24.0);

        Software t3 = new Software("T3", 30.0);

        //add software to list
        availableSoftware.add(t1);
        availableSoftware.add(t2);
        availableSoftware.add(t3);


        benchmarkFramework.addSoftwareTitleForBenchmark("T1");
        benchmarkFramework.addSoftwareTitleForBenchmark("T2");
        benchmarkFramework.addSoftwareTitleForBenchmark("T3");

        //set the console to studyStation
        benchmarkFramework.setConsole(studyStation);

        System.out.println("testing StudyStation...");

        //run the test of studyStation
        benchmarkFramework.run();



        System.out.println("*************************");

        //set the console to learnDitch
        benchmarkFramework.setConsole(learnDitch);

        System.out.println("testing LearnDitch...");

        //run the test of learnDitch
        benchmarkFramework.run();



    }


}
