package via.sdj3.slaughterhouseapi.model;

import java.util.Date;
import java.util.GregorianCalendar;

public class Animal0 {
    private Date date;
    private double weight;
    private int regNumber;
    private String origin;

public Animal0()
{

}

    public Animal0(Date date, double weight, int regNumber, String origin) {
        this.date = date;
        this.weight = weight;
        this.regNumber = regNumber;
        this.origin = origin;
    }

    public Date getDate() {
        return date;
    }

    public double getWeight() {
        return weight;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
