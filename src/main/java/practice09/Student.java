package practice09;

public class Student extends Person {

    private final Klass Class;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.Class = klass;
    }

    public Klass getKlass() {
        return Class;
    }

    public String introduce() {
        return super.introduce() + " I am a Student. " + (Class.getLeader()==this?"I am Leader of Class " + getKlass().getNumber() + ".":"I am at Class " + getKlass().getNumber() + ".");
    }
}
