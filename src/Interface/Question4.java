package Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question4  {
   static  List<Person> al = new ArrayList<>();
    public static void main(String[] args) {
        Person p1 = new Person("john",165,75);
        Person p2 = new Person("Adam",175,89);
        Person p3 = new Person("Zampa",145,67);
        Person p4 = new Person("Rock",139,43);


        al.add(p1);
        al.add(p2);
        al.add(p3);
        al.add(p4);
String str = "Arikaran";
String str2 = "Badam";

        System.out.println("Height based sorting: ");
        heightBasedSort();
        System.out.println(al);
        System.out.println("Weight Based sorting");
        weightBasedSort();
        System.out.println(al);

        System.out.println("Name based Sorting");
        nameBasedSort();
        System.out.println(al);



    }

  public static void nameBasedSort() {
        Comparator comp = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Person p1 = (Person) o1;
                Person p2 = (Person) o2;
                return p1.getName().compareTo(p2.getName());

                }

        };
      Collections.sort(al,comp);
    }

    public static void weightBasedSort() {
        Collections.sort(al,Comparator.comparingInt(Person::getWeight));
    }

    public static void heightBasedSort() {
        Collections.sort(al,Comparator.comparingInt(Person::getHeight));
    }


}
class Person  {
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    private int height;
    private int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}