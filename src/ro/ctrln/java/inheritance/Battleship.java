package ro.ctrln.java.inheritance;

import ro.ctrln.java.util.ProjectUtils;

import java.util.Objects;

 // POJO - Plain Old Java Object

public class Battleship {

    public static final int ID = 1;

    protected String battleshipName;
    private int battleshipCapacity;

    public Battleship(){}

    public Battleship(String battleshipName, int battleshipCapacity) {
        this.battleshipName = battleshipName;
        this.battleshipCapacity = battleshipCapacity;
    }

    public String getBattleshipName() {
        return this.battleshipName;
    }
    // camel case = setBattleshipName

    public void setBattleshipName(String battleshipName) {
        this.battleshipName = battleshipName;
    }

    public int getBattleshipCapacity() {
        return this.battleshipCapacity;
    }

    public void setBattleshipCapacity(int battleshipCapacity) {
        this.battleshipCapacity = battleshipCapacity;
    }

    @Override
    public String toString() {
        return "Battleship{" +
                "battleshipName='" + battleshipName + '\'' +
                ", battleshipCapacity=" + battleshipCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battleship that = (Battleship) o;
        return battleshipCapacity == that.battleshipCapacity && battleshipName.equals(that.battleshipName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battleshipName, battleshipCapacity);
    }

    public void escapeProcedure(int escapePods) {
        ProjectUtils.printMessage("Escape procedure initiated in Battleship class " + escapePods + " escape pods! ");
    }

    public class EscapePod {
        private String escapePodName;
    }

    private class EscapePodTieFighter {
        private String escapePodName;
    }
}
