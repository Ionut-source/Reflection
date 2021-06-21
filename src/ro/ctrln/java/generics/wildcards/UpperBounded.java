package ro.ctrln.java.generics.wildcards;

import ro.ctrln.java.generics.GenericList;
import ro.ctrln.java.model.Person;
import ro.ctrln.java.model.Student;
import ro.ctrln.java.model.Teacher;

public class UpperBounded {

    public static void main(String[] args) {

        GenericList<? extends Person> persons = new GenericList<>();
        GenericList<? extends Person> students = new GenericList<Student>();
        GenericList<? extends Person> teachers = new GenericList<Teacher>();
        
        students = getStudents();

        for (int i = 0; i < students.getSize(); i++) {
            Student student = (Student) students.getElement(i);
            System.out.println(student);
        }

//        persons.addElement(new Person("John", "Doe", "engineer", 40));
//        persons.addElement(new Student("Eliza" , "Jones" , 18));));
//        persons.addElement(new Teacher());

        Person person = persons.getElement(0);
        Student student = (Student) students.getElement(0);
        Teacher teacher = (Teacher) teachers.getElement(0);

    }

    private static GenericList<Student> getStudents() {
        GenericList<Student> students = new GenericList<>();
        students.addElement(new Student("John" , "Sanders" , 23));
        students.addElement(new Student("Emily" , "Blunt" , 25));
        students.addElement(new Student("Eliza" , "Jones" , 18));
        students.addElement(new Student("Ben" , "Fraklin" , 30));
        return students;

    }
}
