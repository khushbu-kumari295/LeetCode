package trafficlightintersection;

public class CrossCar implements Runnable {
    private final int carId;
    private final int roadId;
    private final int direction;

    public CrossCar(int carId, int roadId, int direction) {
        this.carId = carId;
        this.roadId = roadId;
        this.direction = direction;
    }

    @Override
    public void run() {
        System.out.printf("Car %s Has Passed Road %s In Direction %s%n", carId, TrafficLight.convertToRoadString(roadId), direction);
    }
}
