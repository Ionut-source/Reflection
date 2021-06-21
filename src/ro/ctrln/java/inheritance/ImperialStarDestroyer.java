package ro.ctrln.java.inheritance;

public class ImperialStarDestroyer extends Battleship{

    private int numberOfDecks;

    public ImperialStarDestroyer() {

    }

    public int getNumberOfDecks(){
        return numberOfDecks;
    }

    public void setNumberOfDecks(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

    public ImperialStarDestroyer(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }

        public ImperialStarDestroyer(String battleshipName, int numberOfDecks) {
            this.numberOfDecks = numberOfDecks;
            this.setBattleshipName(battleshipName);
    }

    private ImperialStarDestroyer(int battleshipCapacity, int numberOfDecks) {
        this.setBattleshipCapacity(battleshipCapacity);
        this.numberOfDecks = numberOfDecks;
    }

    @Override
    public String toString() {
        return "ImperialStarDestroyer{" +
                "numberOfDecks=" + numberOfDecks +
                ", battershipName=" + getBattleshipName() +
                ", battershipCapacity=" + getBattleshipCapacity() +
                '}';
    }
}
