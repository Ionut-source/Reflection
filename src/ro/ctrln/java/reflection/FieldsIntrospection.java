package ro.ctrln.java.reflection;

import ro.ctrln.java.inheritance.ImperialStarDestroyer;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldsIntrospection {

    public String property = "John";

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        FieldsIntrospection fieldsIntrospection = new FieldsIntrospection();

        Field propertyField = FieldsIntrospection.class.getField("property");

        System.out.println("Modificatorul de acces pt property este: " + Modifier.toString(propertyField.getModifiers()));
        System.out.println("Tipul de data al property este: " + propertyField.getType().getName());

        System.out.println("Valoarea initiala pt property este: " + fieldsIntrospection.property);

        propertyField.set(fieldsIntrospection, "Lisa");

        System.out.println("Valoarea property dupa setarea cu Reflection API este: " + fieldsIntrospection.property);

        propertyField.set(fieldsIntrospection, "322");

        System.out.println("Valoarea  property dupa setarea cu set este: " + fieldsIntrospection.property);

        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        System.out.println("Valoarea initiala numberOfDecks: " + imperialStarDestroyer.getNumberOfDecks());

        Field numberOfDecksField = ImperialStarDestroyer.class.getDeclaredField("numberOfDecks");

        numberOfDecksField.setAccessible(true);
        numberOfDecksField.set(imperialStarDestroyer, 100);

        System.out.println("Valoarea numberOfDecks dupa modificarea cu API: " + imperialStarDestroyer.getNumberOfDecks());
        numberOfDecksField.set(imperialStarDestroyer, 1000);
        System.out.println("Valoarea numberOfDecks dupa modificarea cu metoda seter: " + imperialStarDestroyer.getNumberOfDecks());


    }
}
