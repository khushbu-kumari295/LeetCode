package trafficlightintersection;

/**
 * Traffic Light Controlled Intersection
 */
public class TrafficLight {
    boolean isTrafficLightGreenOnRoad1;

    public TrafficLight() {
        this.isTrafficLightGreenOnRoad1 = true;
    }

    /**
     * CarArrived method will take the decision to turn the light green on road A or road B
     * If the car is arrived on a road when the light is already green, the car will be crossed directly
     * Otherwise, the traffic light will change and car will then cross
     * @param carId ID of the car
     * @param roadId ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
     * @param direction Direction of the car
     * @param turnGreen Use turnGreen.run() to turn light to green on current road
     * @param crossCar Use crossCar.run() to make car cross the intersection
     */
    public void carArrived(
            int carId,           // ID of the car
            int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
            int direction,       // Direction of the car
            Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
            Runnable crossCar    // Use crossCar.run() to make car cross the intersection
    ) {
        synchronized (this) {
            if (roadId == 1) {
                if (!this.isTrafficLightGreenOnRoad1) {
                    turnGreen.run();
                    this.isTrafficLightGreenOnRoad1 = true;
                }
            } else {
                if (this.isTrafficLightGreenOnRoad1) {
                    turnGreen.run();
                    this.isTrafficLightGreenOnRoad1 = false;
                }
            }
            crossCar.run();

        }
    }

    public static String convertToRoadString(int roadId) {
        if (roadId == 1) {
            return "A";
        } else {
            return "B";
        }
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        // Input: cars = [1,3,5,2,4], directions = [2,1,2,4,3], arrivalTimes = [10,20,30,40,50]
        trafficLight.carArrived(1, 1, 2, new TurnGreen(1), new CrossCar(1, 1, 2));
        trafficLight.carArrived(3, 1, 1, new TurnGreen(1), new CrossCar(3, 1, 1));
        trafficLight.carArrived(5, 1, 2, new TurnGreen(1), new CrossCar(5, 1, 2));
        trafficLight.carArrived(2, 2, 4, new TurnGreen(2), new CrossCar(2, 2, 4));
        trafficLight.carArrived(4, 2, 3, new TurnGreen(2), new CrossCar(4, 2, 3));
        System.out.println();
        // Resetting the green light before second input
        trafficLight.isTrafficLightGreenOnRoad1 = true;

        // cars = [1,2,3,4,5], directions = [2,4,3,3,1], arrivalTimes = [10,20,30,40,40]
        trafficLight.carArrived(1, 1, 2, new TurnGreen(1), new CrossCar(1, 1, 2));
        trafficLight.carArrived(2, 2, 4, new TurnGreen(2), new CrossCar(2, 2, 4));
        trafficLight.carArrived(3, 2, 3, new TurnGreen(2), new CrossCar(3, 2, 3));
        trafficLight.carArrived(5, 1, 1, new TurnGreen(1), new CrossCar(5, 1, 1));
        trafficLight.carArrived(4, 2, 3, new TurnGreen(2), new CrossCar(4, 2, 3));

    }
}
