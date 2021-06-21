package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.ImperialStarDestroyer;

import java.lang.reflect.Constructor;

public class ClassConstructors {

    public static void main(String[] args) {

        System.out.println("Constructorii clasei ImperialStarDestroyer:");
        for (Constructor constructor : ImperialStarDestroyer.class.getDeclaredConstructors()) {
            System.out.println("\tConstructor: " + constructor);
        }

        System.out.println("Constructorii publici ai clasei ImperialStarDestroyer:");
        for (Constructor constructor : ImperialStarDestroyer.class.getConstructors()) {
            System.out.println("\tConstructor: " + constructor);
        }
    }
}
