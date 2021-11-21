package decoratorpattern;

public class LuxuryCar extends CarDecorator implements Car {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        baseCar.assemble();
        System.out.print("Adding features of Luxury Car. ");
    }
}
