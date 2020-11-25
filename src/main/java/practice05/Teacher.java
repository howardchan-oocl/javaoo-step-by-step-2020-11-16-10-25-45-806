package practice05;

public class Teacher extends Person {
    private final int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        klass = 0;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (klass != 0 ? "Class " + klass + "." : "No Class.");
    }
}
