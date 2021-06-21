package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.Battleship;

public class ClassIntrospection {

    public static void main(String[] args) {

        Class<Battleship> battleshipOne = Battleship.class;
        Class battleshipTwo = new Battleship().getClass();

        System.out.println("battleshipOne  - numele clasei este: " + battleshipOne.getSimpleName());
        System.out.println("battleshipOne  - numele clasei (canonical) este: " + battleshipOne.getCanonicalName());
        System.out.println("battleshipOne  - numele clasei (canonical) este: " + battleshipOne.getName());

        System.out.println("battleshipTwo  - numele clasei este: " + battleshipTwo.getSimpleName());
        System.out.println("battleshipTwo  - numele clasei (canonical) este: " + battleshipTwo.getCanonicalName());
        System.out.println("battleshipTwo  - numele clasei (canonical) este: " + battleshipTwo.getName());
    }
}
