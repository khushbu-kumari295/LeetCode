package comparatorsolution;

import java.util.Comparator;

public class DateOfBirthComparator implements Comparator<Student> {
    /**
     * Date of Birth in ascending order
     */
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}
