package ro.ctrln.java.inheritance;

import ro.ctrln.java.util.ProjectUtils;

public class XWingStarFighter implements Starship {

    private String destination;
    private int lightYearsToDestination;

    @Override
    public void warp() {
        ProjectUtils.printMessage("XWingStarFighter in now warp speed");
    }

    @Override
    public void setStarshipDestination(String destination) {
        switch (destination) {
            case "base":
                this.destination = "Tatooine";
                break;
            case "empire":
                this.destination = "Coruscant";
                break;
            default:
                this.destination = "Unknown";
        }

    }

    @Override
    public double computeWarpSpeed(int warpFactor, int lightYearsToDestination) {
        this.lightYearsToDestination = lightYearsToDestination;  //efecte laterale
        return Math.pow(warpFactor, 3) * Math.pow(10, 8);
    }

    @Override
    public String toString() {
        return "XWingStarFighter{" +
                "destination='" + destination + '\'' +
                ", lightYearsToDestination=" + lightYearsToDestination +
                '}';
    }
}
