package ro.ctrln.java.reflection;

import ro.ctrln.java.abstraction.Trooper;
import ro.ctrln.java.generics.GenericList;
import ro.ctrln.java.inheritance.Starship;
import ro.ctrln.java.inner.OuterClass;

import java.lang.reflect.Modifier;

public class ClassAccesModifiers {

    public static void main(String[] args) {

        System.out.println("Modificatorii de acces pt clasa GenericList: " + Modifier.toString(GenericList.class.getModifiers()));

        System.out.println("Modificatorii de acces pt interfata Starship: " + Modifier.toString(Starship.class.getModifiers()));

        System.out.println("Modificatorii de acces pt clasa abstracta Trooper: " + Modifier.toString(Trooper.class.getModifiers()));

        System.out.println("Modificatorii de acces pt clasa finala String: " + Modifier.toString(String.class.getModifiers()));

        System.out.println("Modificatorii de acces pt clasa interioara statica InnerClass: " + Modifier.toString(OuterClass.InnerClass.class.getModifiers()));
    }
}
