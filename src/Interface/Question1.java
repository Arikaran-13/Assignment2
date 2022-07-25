package Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

interface Printable {
    void print();
}

interface sortable extends Comparator<Object> {
    int compare(Object o1, Object o2);
}

public class Question1 {
    static ArrayList<Employee> elist = new ArrayList<>();
    static ArrayList<Circle> clist = new ArrayList<>();

    public static void main(String[] args) {
      //  Printall();
        Employee e1 = new Employee("John", 22);
        Employee e2 = new Employee("kumar", 3);
        Employee e3 = new Employee("John", 18);
        Employee e4 = new Employee("kumar", 1);
        Circle c1 = new Circle(12);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(22);
        Circle c4 = new Circle(1);
        elist.add(e1);
        elist.add(e2);
        elist.add(e3);
        elist.add(e4);
        clist.add(c1);
        clist.add(c2);
        clist.add(c3);
        clist.add(c4);
        sortable s = new Employee();
        sortable circle = new Circle();
        Collections.sort(elist, s);
        Collections.sort(clist, circle);
        System.out.println(elist);
        System.out.println(clist);

    }

    public static void Printall() {
        Printable obj1 = new Employee();
        Printable obj2 = new Circle();
        System.out.println(obj1);
        System.out.println(obj2);
    }

}

class Employee implements Printable, sortable {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public void print() {
        System.out.println("From employee class");

    }

    @Override
    public int compare(Object o1, Object o2) {
        Employee e = (Employee) o1;
        Employee e1 = (Employee) o2;
        if (e.id > e1.id) {
            return 1;
        } else if (e.id < e1.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Circle implements Printable, sortable {
    private int radius;

    public Circle(int r) {
        this.radius = r;
    }

    Circle() {
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void print() {
        System.out.println("From circle class");
    }

    @Override
    public int compare(Object o1, Object o2) {
        Circle c = (Circle) o1;
        Circle c1 = (Circle) o2;
        if (c.radius > c1.radius) {
            return 1;
        } else if (c.radius < c1.radius) {
            return -1;
        } else {
            return 0;
        }
    }
}

