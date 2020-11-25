package practice09;

import java.util.ArrayList;

public class Klass {
    private final int klass;
    private Student leader;
    private ArrayList<Student> students;

    public Klass(int klass) {
        this.klass = klass;
        leader=null;
        students = new ArrayList<Student>();
    }

    public int getNumber() {
        return klass;
    }

    public String getDisplayName() {
        return "Class " + klass;
    }

    public void assignLeader(Student student) {
        if(!students.contains(student)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        students.add(student);
    }
}

