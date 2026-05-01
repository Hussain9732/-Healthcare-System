package Smarthealthcare;

public class Person {
    private String name;

    public Person(String name) {
        setName(name);
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name.trim();// here .trim() is used to not store blank space in the name like if we dont write anything in name it stores invalid name in the name//
    }
}
