package ro.ctrln.java.model;

import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private String job;
    private int age;


    public Person () {}


    public Person(String firstName, String lastName, String job, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && firstName.equals(person.firstName) && lastName.equals(person.lastName) && job.equals(person.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, job, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                '}';
    }
}
