package ro.ctrln.java.annotations;

import ro.ctrln.java.generics.GenericList;

import java.lang.reflect.Method;

public class BittnetAnnotationProcessor {

    public static void main(String[] args) {

        GenericList<String> allCategories = new GenericList<>();
        allCategories.addElement("programing");
        allCategories.addElement("networking");
        allCategories.addElement("web");

        System.out.println("Toate categoriile disponibile:");
        showGenericList(allCategories);
        trackCourseCategories(allCategories);

    }

    private static void trackCourseCategories(GenericList<String> allCategories) {
        GenericList<String> availableCategories = new GenericList<>();
        GenericList<String> newCategories = new GenericList<>();

        for (Method method : BittnetCourseFactory.class.getDeclaredMethods()) {
            BittnetCourseAnnotation annotation = method.getAnnotation(BittnetCourseAnnotation.class);
            if (annotation != null) { //testeaza daca metoda are intr-adevar adnotarea BittnetCourseAnnotation
                String category = annotation.category();
                System.out.println("Categoria gasita: " + category);
                availableCategories.addElement(category);
                if (!allCategories.contains(category)) {
                    newCategories.addElement(category);
                }
            }
        }

        System.out.println("Categorii disponibile gasite:");
        showGenericList(availableCategories);
        System.out.println("Categorii noi:");
        showGenericList(newCategories);
    }

        private static void showGenericList (GenericList < String > genericList) {
            for (int i = 0; i < genericList.getSize(); i++) {
                System.out.println("\t" + genericList.getElement(i));
            }
        }
    }

