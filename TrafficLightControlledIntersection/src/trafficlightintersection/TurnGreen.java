package trafficlightintersection;

public class TurnGreen implements Runnable {
    private int roadId;

    public TurnGreen(int roadId) {
        this.roadId = roadId;
    }

    @Override
    public void run() {
        System.out.printf("Traffic Light On Road %s Is Green%n", TrafficLight.convertToRoadString(roadId));
    }
}
