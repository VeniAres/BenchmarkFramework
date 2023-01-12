package Framework;

import org.example.LearnDitch;
import org.example.Software;
import org.example.StudyStation;

import java.util.ArrayList;
import java.util.List;

public class Producer {

    public static void main(String[] args) {

        List<Software> availableSoftware = new ArrayList<Software>();

        Software t1 = new Software("T1", 13.0);

        Software t2 = new Software("T2", 24.0);

        Software t3 = new Software("T3", 30.0);

        availableSoftware.add(t1);
        availableSoftware.add(t2);
        availableSoftware.add(t3);

        StudyStation studyStation = new StudyStation(availableSoftware);

        LearnDitch learnDitch = new LearnDitch(availableSoftware);

        BenchmarkFramework benchmarkFramework = new BenchmarkFramework(new Benchmark());
        benchmarkFramework.addSoftwareTitleForBenchmark("T1");
        benchmarkFramework.addSoftwareTitleForBenchmark("T2");
        benchmarkFramework.addSoftwareTitleForBenchmark("T3");

        benchmarkFramework.setConsole(studyStation);


        System.out.println("testing StudyStation...");

        benchmarkFramework.run();

        System.out.println();

        benchmarkFramework.setConsole(learnDitch);

        System.out.println("testing LearnDitch...");

        benchmarkFramework.run();


    }


}
