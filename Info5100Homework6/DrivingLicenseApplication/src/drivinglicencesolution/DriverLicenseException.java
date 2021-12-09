package drivinglicencesolution;

public class DriverLicenseException extends Exception {
    public DriverLicenseException(int age) {
        super(String.format("The age of the applicant is %s which is too early to apply for a driving license", age));
    }
}
