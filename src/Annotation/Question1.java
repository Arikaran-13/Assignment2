package Annotation;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
         @SuppressWarnings("rawtypes")
        List l = new ArrayList();
         Animal a = new Animal();

         a.food();
    }
}
class Animal{
    public void welcome(){
        System.out.println("Welcome to forest");
    }

    @Deprecated
    public void food (){

    }
}
class Tiger extends  Animal{
    @Override
    public void welcome(){
        System.out.println("welcome to tiger den");
    }

}