package ro.ctrln.java.reflection;

public class EnumsAndArraysIntrospection {

    enum Owners {PERSON, COMPANY};

    public static void main(String[] args) {

        Class personClass = OwnerType.PERSON.getClass();
        System.out.println("Numele clasei OwnerType.PERSON este: " + personClass.getName());
        System.out.println("Numele clasei OwnerType.PERSON este: " + personClass.getCanonicalName());
        System.out.println("Numele clasei OwnerType.PERSON este: " + personClass.getSimpleName());

        Class companyClass = OwnerType.COMPANY.getClass();
        System.out.println("Numele clasei Owners.COMPANY este: " + personClass.getName());
        System.out.println("Numele clasei Owners.COMPANY este: " + personClass.getCanonicalName());
        System.out.println("Numele clasei Owners.COMPANY este: " + personClass.getSimpleName());

        int[] ints = new int[10];
        System.out.println("Numele clasei pentru ints este: " + ints.getClass().getName());
        System.out.println("Numele clasei (canonical) pentru ints este: " + ints.getClass().getCanonicalName());
        System.out.println("Numele clasei (simplu) pentru ints este: " + ints.getClass().getSimpleName());

        Class doubleClas = double.class;
        System.out.println("Numele pentru doubleClass este: " + doubleClas.getName());
        System.out.println("Numele (canonical)  pentru doubleClass este: " + doubleClas.getCanonicalName());
        System.out.println("Numele simplu  pentru doubleClass este: " + doubleClas.getSimpleName());


    }
}
