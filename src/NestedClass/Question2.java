package NestedClass;

import java.util.Random;

public class Question2 {
    public static void main(String[] args) {


        Patient patient = new Patient("John", 1);
        Patient.BloodPressure bp = patient.new BloodPressure(100);
        Random r = new Random();


       listener l = patient.new BloodPressure(100);
        int level= r.nextInt(220);
        System.out.println("Bp level is : "+level);
        bp.setBpLevel(level);
       if(bp.getBpLevel() > 140){
           l.callBack();

       }
    }
}
interface listener{
    void callBack();
}
class Patient{
    private String name;
    private int id;

    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    class BloodPressure implements listener{
         private int bpLevel;

         public BloodPressure(int bpLevel) {
             this.bpLevel = bpLevel;
         }

         public int getBpLevel() {
             return bpLevel;
         }

         public void setBpLevel(int bpLevel) {
             this.bpLevel = bpLevel;
         }

        @Override
        public  void callBack() {
            System.out.println("Danger level bp more than 140...");
        }
    }
}