package practice06;

public class Student extends Person {

    private final Klass Class;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.Class = klass;
    }

    public Klass getKlass() {
        return Class;
    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + getKlass().getNumber() + ".";
    }
}
