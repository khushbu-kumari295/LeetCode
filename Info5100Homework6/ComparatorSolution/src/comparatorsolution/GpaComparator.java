package comparatorsolution;

import java.util.Comparator;

public class GpaComparator implements Comparator<Student> {
    /**
     * Gpa in descending order
     */
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o2.getGpa()- o1.getGpa());
    }
}
