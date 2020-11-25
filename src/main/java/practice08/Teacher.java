package practice08;

public class Teacher extends Person {
    private final Klass klass;

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        klass = null;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return super.introduce() + " I am a Teacher. I teach " + (klass != null ? "Class " + klass.getNumber() + "." : "No Class.");
    }

    public String introduceWith(Student student) {
        return super.introduce() + " I am a Teacher. I " + (this.klass == student.getKlass() ? "teach " + student.getName() + "." : "don't teach Jerry.");
    }
}
