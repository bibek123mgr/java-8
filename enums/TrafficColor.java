public enum TrafficColor {
    RED(10000), YELLOW(1000), GREEN(4000);

    private final int onTimeInMilliSec;

    public int getOnTimeInMilliSec() {
        return this.onTimeInMilliSec;
    }

    TrafficColor(int onTimeInMilliSec) {
        this.onTimeInMilliSec = onTimeInMilliSec;
    }
}
