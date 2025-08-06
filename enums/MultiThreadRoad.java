public class MultiThreadRoad {

    public static void main(String[] args) {

        TrafficLightThread t1 = new TrafficLightThread(TrafficColor.RED);
        TrafficLightThread t2 = new TrafficLightThread(TrafficColor.YELLOW);
        TrafficLightThread t3 = new TrafficLightThread(TrafficColor.GREEN);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
