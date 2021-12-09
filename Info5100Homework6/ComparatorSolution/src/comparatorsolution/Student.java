package comparatorsolution;

import java.util.*;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public Student(int id, String name, double gpa, int year, int month, int day) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = getDate(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return ("Student " + "Name:" + this.getName() +
                ", GPA: " + this.getGpa() +
                ", Date of Birth: " + this.getDateOfBirth());
    }

    private static Date getDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DAY_OF_MONTH, day);
        return cal.getTime();
    }
}