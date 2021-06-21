package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.ImperialStarDestroyer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassFieldsAndMethods {

    public static void main(String[] args) {

        System.out.println("Pachetul clasei ImperialStarDestroyer: " + ImperialStarDestroyer.class.getPackage());

        System.out.println("Proprietatiile declarate in clasa ImperialStarDestroyer");
        for (Field field : ImperialStarDestroyer.class.getDeclaredFields()) {
            System.out.println("\tField: " + field.getName());
        }

        System.out.println("Proprietatiile din clasa ImperialStarDestroyer");
        for (Field field : ImperialStarDestroyer.class.getFields()) {
            System.out.println("\tField: " + field.getName());
        }

        System.out.println("Metodele definite in ImperialStarDestroyer");
        for (Method method : ImperialStarDestroyer.class.getDeclaredMethods()) {
            System.out.println("\tMethod: " + method.getName());
        }

        System.out.println("Toate metodele din ImperialStarDestroyer");
        for (Method method : ImperialStarDestroyer.class.getMethods()) {
            System.out.println("\tMethod: " + method.getName());
        }
    }
}
