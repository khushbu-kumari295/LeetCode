package comparatorsolution;

import java.util.*;

public class ComparatorMain {
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student(111, "snowy", 79.8, 1999, 8, 12));
        listOfStudents.add(new Student(111, "sophia", 89.8, 2001, 3, 16));
        listOfStudents.add(new Student(111, "maria", 99.8, 2003, 2, 2));
        listOfStudents.add(new Student(111, "amanda", 93.8, 1992, 9, 21));
        listOfStudents.add(new Student(111, "peter", 95.2, 1991, 4, 22));

        System.out.println("Before Sorting the student data:");
        listOfStudents.forEach(System.out::println);

        System.out.println("********************************\n");

        // Sort by ascending order of 'name'
        System.out.println("After Sorting the student data by Name (Ascending Order):");
        listOfStudents.sort(new NameComparator());
        listOfStudents.forEach(System.out::println);

        System.out.println("********************************\n");

        // Sort by descending order of 'gpa'
        System.out.println("After Sorting the student data by GPA (Descending Order):");
        listOfStudents.sort(new GpaComparator());

        listOfStudents.forEach(System.out::println);
        System.out.println("********************************\n");

        //Sort by ascending order of 'dateOfBirth'
        System.out.println("After Sorting the student data by Date of Birth (Ascending Order):");
        listOfStudents.sort(new DateOfBirthComparator());
        listOfStudents.forEach(System.out::println);
    }

}



