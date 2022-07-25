package stud;

import fact.Faculty;

public class Student {
    private int rollNo;

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        Student s = new Student(8);
        Faculty f = new Faculty();
        System.out.println( f.getStudentMArk(s.getRollNo()));
    }
}

