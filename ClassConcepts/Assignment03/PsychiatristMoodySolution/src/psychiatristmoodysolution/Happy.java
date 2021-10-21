package psychiatristmoodysolution;

public class Happy extends Moody {
    //returns string indicating happy
    public String getMood() {
        return "happy";

    }

    //print laughter string “heeehee....hahahah...HAHAHA!!”
    @Override
    public void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    //returns message about self: “Subject laughs a lot”
    public String toString() {
        return "Subject laughs a lot";
    }
}
