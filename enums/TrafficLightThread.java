public class TrafficLightThread extends Thread {

    private final TrafficColor color;

    public TrafficLightThread(TrafficColor color) {
        this.color = color;
    }

    @Override
    public void run() {

        System.out.printf("%s is active", color);
        System.out.println();

        try {

            Thread.sleep(color.getOnTimeInMilliSec());
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }

        System.out.printf("%s is Inactive", color);

    }
}