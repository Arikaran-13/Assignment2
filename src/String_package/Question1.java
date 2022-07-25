package String_package;

public class Question1 {
    public static void main(String[] args) {
        String str = "ABC";
        String str1 = new String("ABC");

        if(str == str1){
            System.out.println("Yes equal");
        }
        else{
            System.out.println("Not equal");
        }
        if (str.equals(str1)){
            System.out.println("Yes equals");
        }
        else{
            System.out.println("Not equal");
        }
    }

}
