package ro.ctrln.java.abstraction;

import ro.ctrln.java.util.ProjectUtils;

public abstract class Trooper {

    private int numberOfCapabilites;

    public int getNumberOfCapabilites() {
        return this.numberOfCapabilites;
    }

        public void setNumberOfCapabilites(int numberOfCapabilites){
            this.numberOfCapabilites = numberOfCapabilites;
        }

        public void fight(String enemy) {
            ProjectUtils.printMessage("Fighting the enemy" + enemy );
        }

        public abstract String warCry();
    }

