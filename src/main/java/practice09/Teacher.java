package practice09;

import java.util.Collection;
import java.util.LinkedList;

public class Teacher extends Person {

    private final LinkedList<Klass> linkedList;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.linkedList = null;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> linkedList) {
        super(id, name, age);
        this.linkedList = linkedList;
    }

    public String introduce() {
        String klassName = "";
        if(linkedList!=null) {
            for (int i = 0; i < linkedList.size(); i++) {
                klassName += linkedList.get(i).getNumber();
                if (i != linkedList.size() - 1)
                    klassName += ", ";
            }
        }
        return super.introduce() + " I am a Teacher. I teach " + (linkedList != null ? "Class " + klassName + "." : "No Class.");
    }

    public String introduceWith(Student student) {
        boolean isTeach = false;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i)==student.getKlass())
                isTeach = true;
        }
        return super.introduce() + " I am a Teacher. I " + (isTeach? "teach " + student.getName() + "." : "don't teach Jerry.");
    }

    public LinkedList<Klass> getClasses() {
        return linkedList;
    }

    public boolean isTeaching(Student student) {
        boolean isTeach = false;
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i)==student.getKlass())
                isTeach = true;
        }
        return isTeach;
    }
}