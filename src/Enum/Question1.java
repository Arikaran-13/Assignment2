package Enum;

public class Question1 {
    public static void main(String[] args) {
        Order newOrder1 = new Order(1,23,"bat",1500,Status.NEW);
        Order o2 = new Order(2,3,"Ball",500,Status.ACCEPTED);
        Order o3 = new Order(3,5,"medikit",700,Status.COMPLETED);
        Order o4 = new Order(4,7,"gloves",300,Status.REJECTED);

        System.out.println( newOrder1.getS());
        System.out.println( o2.getS());
        System.out.println( o3.getS());
        System.out.println( o4.getS());

    }
}
enum Status{
    NEW(2),  REJECTED(-1), ACCEPTED(1), COMPLETED(0);
    private int status;

    Status(int status) {
        this.status = status;
    }



}
class Order{
    private int id;
    private int q;
    private String name;
    private int price;
    private Status s;

    public Order(int id, int q, String name, int price,Status s) {
        this.id = id;
        this.q = q;
        this.name = name;
        this.price = price;
        this.s=s;
    }

    public int getId() {
        return id;
    }

    public Status getS() {
        return s;
    }

    public void setS(Status s) {
        this.s = s;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}