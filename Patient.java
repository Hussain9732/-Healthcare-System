package Smarthealthcare;

public class Patient extends Person {
    private int age;

    public Patient(String name, int age) {
        super(name);
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public final void setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("Invalid age");
        this.age = age;
    }
}