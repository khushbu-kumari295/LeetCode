package drivinglicencesolution;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static java.util.Calendar.*;

public class DrivingLicenseApplication {

    public static int getDiffYears(Date first, Date last) {
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int diff = b.get(YEAR) - a.get(YEAR);
        if (a.get(MONTH) > b.get(MONTH) ||
                (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
            diff--;
        }
        return diff;
    }

    private static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }

    private static Date readDateOfBirthFromKeyboard() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Date in MM/DD/YYYY format");
        String dateStr = scanner.next();
        Date dateOfBirth = new SimpleDateFormat("MM/dd/yyyy").parse(dateStr);
        System.out.println("Entered Date of Birth is " + dateOfBirth);
        return dateOfBirth;
    }


    public static void main(String[] args) throws ParseException {
        Date dateOfBirth = readDateOfBirthFromKeyboard();
        int userAge = getDiffYears(dateOfBirth, new Date());
        System.out.println("Age of the user is " + userAge);
        try {
            if (userAge < 16) {
                throw new DriverLicenseException(userAge);
            } else {
                System.out.println("You are Qualified for driving license!!!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
