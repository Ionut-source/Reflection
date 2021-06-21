package ro.ctrln.java.generics;

import ro.ctrln.java.model.Person;
import ro.ctrln.java.model.Student;
import ro.ctrln.java.model.Teacher;

public class GenericListBoundUsage {

    public static void main(String[] args) {

        //GenericListBound<String> strings = new GenericListBound<>();

        GenericListBound<Person> persons = new GenericListBound<>();
        GenericListBound<Student> students = new GenericListBound<>();
        GenericListBound<Teacher> teacher = new GenericListBound<>();

        persons.addElement(new Person());
        persons.addElement(new Student());
        persons.addElement(new Teacher());

        students.addElement(new Student());
//        students.addElement(new Person());
//        students.addElement(new Teacher());

        teacher.addElement(new Teacher());
//        teacher.addElement(new Person());
//        teacher.addElement(new Student());
    }
}
