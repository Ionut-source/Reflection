package ro.ctrln.java.reflection;

import ro.ctrln.java.generics.GenericList;

import java.lang.reflect.TypeVariable;

public class ClassTypes {

    public static void main(String[] args) {

        for (TypeVariable <Class<GenericList>> typeVariable : GenericList.class.getTypeParameters()) {
            System.out.println("Tipul parametrizat al clasei GenericList: " + typeVariable.getName());
        }
    }
}
