package Annotation;

import java.lang.annotation.*;

public class Question2 {
    public static void main(String[] args) {


        Employee e = new Employee();
      Class c = e.getClass();
        Annotation an = c.getAnnotation(Getter.class);
        Getter getter = (Getter)an;
        System.out.println(  getter.getAge());
        System.out.println(  getter.getName());
        System.out.println(getter.getId());


    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Getter{
    String getName();
    int getId();
    int getAge();
}
@Getter(getId=1,getAge = 21,getName="john")
class Employee{
    private int id;
    private String name;
    private int age;

}