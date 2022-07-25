package fact;

import java.util.ArrayList;

public class Faculty {
    static ArrayList<Integer> al = new ArrayList<>();

    public int getStudentMArk(int roll){
        al.add(9);
        al.add(90);
        al.add(30);
        al.add(90);
        al.add(80);
        al.add(60);  al.add(20);
        al.add(50);  al.add(10);  al.add(80);
        al.add(60);
        al.add(50);
        try {
            return al.get(roll);
        }catch (Exception e){
            System.out.println("please enter the roll number from 0 to 11");
        }


        return 0;


    }

}
