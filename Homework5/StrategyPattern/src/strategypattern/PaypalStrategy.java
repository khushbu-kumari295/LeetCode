package strategypattern;

public class PaypalStrategy implements PaymentStrategy {
    public String email;

    public PaypalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paypal : $" + amount);
    }
}
