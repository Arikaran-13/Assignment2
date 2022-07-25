package Interface;

public class Question3 {
    public static void main(String[] args) throws CloneNotSupportedException {
     Employees emp1 = new Employees("13/2/2001");
     Employees emp2 = emp1; // shallow copy;
        Employees emp3 = new Employees("13/2/2001");
        Employees emp4 = new Employees();
        emp4.data_of_birth=emp3.data_of_birth;  // deep copy

        Employees emp5 = (Employees)emp1.clone(); // clonable copy
    }
}
class Employees implements Cloneable{
    public  String data_of_birth;

    public Employees(String data_of_birth) {
        this.data_of_birth = data_of_birth;
    }
    Employees(){}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
