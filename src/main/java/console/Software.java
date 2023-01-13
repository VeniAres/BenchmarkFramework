package console;


/**
 * @author Marko Petric;mp.marko@hotmail.com;3660845;Niklas Werner;niklas.0711@gmax.de;3662733
 * @version 13.01.2023
 */


public class Software {

    private final String title;
    private final Double consumption;


    /**
     * creates a Software object with given title and consumption - consumption needs to be in between 1.0 and 50.0
     * @param title of the Software
     * @param consumption of the Software
     */
    public Software(final String title,final Double consumption) {
        this.title = title;
        this.consumption = consumption;

        if (consumption < 1.0 || consumption > 50.0){
            throw new  IllegalArgumentException("The consumption has to be between 1.0 and 50.0!");
        }

    }

    /**
     * returns the title of the software
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * returns the consumption of the software
     * @return consumption
     */
    public Double getConsumption() {
        return this.consumption;
    }


}
