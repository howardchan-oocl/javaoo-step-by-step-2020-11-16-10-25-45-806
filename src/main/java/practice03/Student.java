package practice03;

public class Student extends Person {

    private final int Klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.Klass = klass;
    }

    public int getKlass() {
        return Klass;
    }

    public String introduce() {
        return "I am a Student. I am at Class " + getKlass() + ".";
    }
}
