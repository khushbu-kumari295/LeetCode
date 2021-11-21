package decoratorpattern;

public class SportsCar extends BasicCar implements Car {

    public SportsCar(BasicCar basicCar) {
        basicCar.assemble();
    }

    @Override
    public void assemble() {
        System.out.print(" Adding features of Sports Car.");
    }
}
