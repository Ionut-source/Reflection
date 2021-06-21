package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.Battleship;
import ro.ctrln.java.inheritance.ImperialStarDestroyer;

public class ClassesInClasses {

    public static void main(String[] args) {

        System.out.println("Parintele ImperialStarDestroyer este: " + ImperialStarDestroyer.class.getSuperclass().getName());

        for (Class<?> characterClass : Character.class.getClasses()) {
            System.out.println("\tClasa din interiorul Character este: " + characterClass);
        }

        for (Class<?> battleshipInerClass : Battleship.class.getDeclaredClasses()) {
            System.out.println("Clasa din interiorul Battleship: " + battleshipInerClass);
        }

        System.out.println("Clasa in care este definita EscapePod este: " + Battleship.EscapePod.class.getEnclosingClass().getName());

        for (Class<?> aClass : Battleship.class.getDeclaredClasses()) {
            System.out.println("Enclosing class for aClass: " + aClass.getSimpleName() + " is " + aClass.getEnclosingClass().getSimpleName());
        }
    }
}
