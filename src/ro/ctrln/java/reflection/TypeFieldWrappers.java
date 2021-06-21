package ro.ctrln.java.reflection;

public class TypeFieldWrappers {

    public static void main(String[] args) {

        Class <Double> doubleClass =  Double.TYPE;

        System.out.println("Numele doubleClass: " + doubleClass.getName());
        System.out.println("Numele canonic pt doubleClass este: " + doubleClass.getCanonicalName());
        System.out.println("Numele simplu pt doubleClass este: " + doubleClass.getSimpleName());

        System.out.println("Numele pt double este: " + double.class.getName());
        System.out.println("Numele canonic pt double este: " + double.class.getCanonicalName());
        System.out.println("Numele simplu pt double este: " + double.class.getSimpleName());
    }
}
