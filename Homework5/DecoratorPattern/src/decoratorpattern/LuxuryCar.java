package decoratorpattern;

public class LuxuryCar extends BasicCar implements Car {
    public LuxuryCar(BasicCar basicCar) {
        basicCar.assemble();
    }

    @Override
    public void assemble() {
        System.out.print(" Adding features of Luxury Car.");
    }
}
