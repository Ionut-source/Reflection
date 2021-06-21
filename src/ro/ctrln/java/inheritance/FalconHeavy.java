package ro.ctrln.java.inheritance;


import ro.ctrln.java.util.ProjectUtils;

public class FalconHeavy extends Battleship implements Starship, Rocket{

    private String destination;

    @Override
    public void warp() {
        ProjectUtils.printMessage("FalconHeavy doesn't warp! She goes to the moon!");
    }

    @Override
    public void setStarshipDestination(String destination) {
        this.destination = getBattleshipName() + " goes to " + destination;

    }

    @Override
    public double computeWarpSpeed(int warpFactor, int lightYearsToDestination) {
        return 0;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return this.destination;
        }

    @Override
    public String toString() {
        return "FalconHeavy{" +
                "destination='" + destination + '\'' +
                ", battleshipName=" + getBattleshipName() +
                ", battleshipCapacity=" + getBattleshipCapacity() +
                '}';
    }

    @Override // adnotare - marcam faptul ca aceasta metoda este suprascrisa
    public void louchCountdown() {
        for (int i = 10; i>=0; i--){
            ProjectUtils.printMessage("Lounch sequence: " + i);
        }
    }
    // aceasta metoda este mostenita din clasa parinte Battleship si este suprascrisa
    @Override
    public void escapeProcedure(int escapePods) {
        super.escapeProcedure(escapePods);
        ProjectUtils.printMessage("We are in Falcon Heavy now! Battleship name is: " + this.battleshipName);
        ProjectUtils.printMessage("Escape procedure initiated in Facon Heavy class with " + escapePods + " escape pods!");
    }

    public String escapeProcedure(boolean activated) {
        return activated ? "Escape procedure initiated!" : "Escape procedure abort!";
    }

    public void escapeProcedure(int escapePods, boolean activated){
        ProjectUtils.printMessage(escapeProcedure(activated));
        if (activated) {
            escapeProcedure(escapePods);
        }
    }
    // varargs - variable arguments - transmitem un numar variabil de parametri catre metoda noastra
    public void escapeProcedure(boolean ... activated) {
        for(boolean active : activated) {
            ProjectUtils.printMessage("Activation sequence: " + active);
        }
    }

    public void escapeProcedure() {
        ProjectUtils.printMessage("Waiting for the escape procedure!");
    }
}
