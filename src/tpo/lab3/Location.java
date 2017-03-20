package tpo.lab3;

import java.util.Date;

/**
 * Created by anastasia on 19.03.17.
 */
public class Location {
    double x,y,z;
    Date date; //Date() This constructor initializes the object with the current date and time.

    public void setLocation(double x, double y, double z, Date date) {
        this.date = date;
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
