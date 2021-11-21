package decoratorpattern;

public abstract class CarDecorator implements Car {
    protected Car baseCar;

    public CarDecorator(Car car) {
        this.baseCar = car;
    }

    public abstract void assemble();
}
