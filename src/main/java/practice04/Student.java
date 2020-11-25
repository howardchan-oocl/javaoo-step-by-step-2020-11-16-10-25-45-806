package practice04;

public class Student extends Person {

    private final int Class;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.Class = klass;
    }

    public int getKlass() {
        return Class;
    }

    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + getKlass() + ".";
    }
}