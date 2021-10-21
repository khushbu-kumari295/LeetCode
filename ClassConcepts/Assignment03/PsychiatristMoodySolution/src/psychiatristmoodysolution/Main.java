package psychiatristmoodysolution;

public class Main {

    public static void main(String[] args) {
        Psychiatrist psychiatrist = new Psychiatrist();
        Moody sadObject = new Sad();
        Moody happyObject = new Happy();

        psychiatrist.examine(happyObject);
        psychiatrist.observe(happyObject);


        psychiatrist.examine(sadObject);
        psychiatrist.observe(sadObject);
    }
}
