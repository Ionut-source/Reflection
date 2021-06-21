package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.Battleship;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class MethodsIntrospection {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Battleship battleship = new Battleship();

        System.out.println("Metodele din clasa Battleship:");

        for (Method method : Battleship.class.getDeclaredMethods()) {
            System.out.println("\tMethod: " + method.getName() + " are modificatorii de acces: " + Modifier.toString(method.getModifiers()));
        }

        Method setBattleshipNameMethod = battleship.getClass().getMethod("setBattleshipName", String.class);
        System.out.println("Paramentrii metodelor din clasa Batleship:");

        for (Parameter parameter : setBattleshipNameMethod.getParameters()) {
            System.out.println("Parametru: name=" + parameter.getName() + " , tip= " + parameter.getType());
        }

        battleship.setBattleshipName("Nume initial");
        System.out.println("Numele initial al battleshipName este: " + battleship.getBattleshipName());

        setBattleshipNameMethod.invoke(battleship, "Nume cu Reflection API");
        System.out.println("Numele setat cu Reflection API este: " + battleship.getBattleshipName());
    }
}
