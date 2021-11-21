package strategypattern;

public class CreditCardStrategy implements PaymentStrategy {

    public String cardNumber;

    public CreditCardStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("CreditCard : $" + amount);
    }
}
