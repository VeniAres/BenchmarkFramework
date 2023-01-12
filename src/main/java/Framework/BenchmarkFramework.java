package Framework;

import org.example.Console;

import java.util.ArrayList;
import java.util.List;

public class BenchmarkFramework {

    public Benchmark benchmark;
    public Console console;
    private final List<String> softwareTitlesToTest = new ArrayList<String>();

    public BenchmarkFramework(Benchmark benchmark) {
        this.benchmark = benchmark;
    }

    public void run(){

        for (String title:softwareTitlesToTest){
            Double performance = benchmark.executeBenchMark(title,console);
            System.out.println("performance of Console is "+ performance + " of the " + title + " Software");
        }
    }

    public void setConsole(Console console){
        this.console = console;
    }

    public void addSoftwareTitleForBenchmark(String title){

        softwareTitlesToTest.add(title);
    }



}
