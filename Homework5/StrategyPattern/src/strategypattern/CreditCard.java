package strategypattern;

public class CreditCard implements PaymentStrategy{

    String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + "paid by card");
    }
}
