package ro.ctrln.java.model;

public class Teacher extends  Person {

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, Integer age, String job) {
        super(firstName, lastName, job, age);
    }

    public Teacher(String firstName, String lastName, Integer age) {
        super(firstName, lastName,  "teacher", age);
    }
}
