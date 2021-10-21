package psychiatristmoodysolution;

public class Psychiatrist {

    private Moody _moodyObject;

    //asks moody object about its mood
    public void examine(Moody moodyObject) {
        System.out.println("How are you feeling today?");
        this._moodyObject = moodyObject;
        this._moodyObject.queryMood();
        System.out.println();
        System.out.println();
    }

    //a moodyObject is observed to either laugh or cry
    public void observe(Moody moodyObject) {
        moodyObject.expressFeelings();
        System.out.println("Observation: " + this);
        System.out.println();
    }

    //returns message about self: “Subject laughs a lot”
    public String toString() {
        return this._moodyObject.toString();
    }
}
