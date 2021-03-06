package decoratorpattern;

public class SportsCar extends CarDecorator implements Car {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        baseCar.assemble();
        System.out.print("Adding features of Sports Car. ");
    }
}
