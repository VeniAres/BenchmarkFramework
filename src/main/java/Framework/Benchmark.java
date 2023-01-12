package Framework;

import org.example.Console;
import org.example.Software;


public class Benchmark {


    public Double executeBenchMark(String softwareTitle, Console console) {
        for (Software software : console.getSoftwareList()) {

            if (software.getTitle().equals(softwareTitle)) {
                return console.getProcessingUnit().getPerformance() / software.getConsumption();

            }
        }
        throw new RuntimeException("software title " + softwareTitle + " is not installed on console.");

    }

}
