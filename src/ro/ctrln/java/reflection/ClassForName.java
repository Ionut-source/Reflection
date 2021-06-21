package ro.ctrln.java.reflection;

public class ClassForName {

    public static void main(String[] args) {
        
        String canonicalName = "ro.ctrln.java.inheritances.FalconHeavy";

        try {
            Class falconHeavyClass = Class.forName(canonicalName);
            System.out.println("Numele FalconHeavyClass este: " + falconHeavyClass.getName());
            System.out.println("Numele canonic FalconHeavyClass este: " + falconHeavyClass.getCanonicalName());
            System.out.println("Numele simplu FalconHeavyClass este: " + falconHeavyClass.getSimpleName());
        } catch (ClassNotFoundException e) {
            System.out.println("Clasa " + canonicalName + " negasita!");
        }
    }
}
