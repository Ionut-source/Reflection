package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.Battleship;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class ConstructionIntrospection {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

       // Battleship.class.getDeclaredConstructors();
        for (Constructor constructor : Battleship.class.getConstructors()) {
            System.out.println("Constructor: " + constructor);
            for (Parameter parameter : constructor.getParameters()) {
                System.out.println("\tParamentrul - nume: " + parameter.getName() + ", tip: " + parameter.getType());
            }
        }

        Constructor<Battleship> battleshipConstructor = Battleship.class.getConstructor(String.class, int.class);

        Battleship battleship = battleshipConstructor.newInstance("TieFighter", 1000);
        System.out.println("battleship creat cu Reflection API: " + battleship);

        //Battleship battleshipOne = battleshipConstructor.newInstance("TieFighter", "5000");

        Battleship battleshipThree = battleship.getClass().newInstance();
        Battleship battleshipFour = Battleship.class.newInstance();
        System.out.println(battleshipThree);
        System.out.println(battleshipFour);
    }
}
