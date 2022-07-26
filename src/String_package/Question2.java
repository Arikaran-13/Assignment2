package String_package;

public class Question2 {
   static String str = "ABC";
   static String str2 = "ABC";
   static StringBuilder sb = new StringBuilder("ABC");
   static StringBuilder sb1 = new StringBuilder("ABC");
    public static void main(String[] args) {


        StringImmutable();
        StringBuildermuttable();
        StringBuffermuttable();


    }

    private static void StringBuffermuttable() {

        StringBuffer sb = new StringBuffer("JAVA");
        StringBuffer sb1 = new StringBuffer("JAVA");
        System.out.println(sb == sb1);
        StringBuffer sb2 = new StringBuffer("World");
        sb.append(sb2);
        System.out.println(sb==sb1);   // muttable

    }

    private static void StringBuildermuttable() {
        System.out.println(sb==sb1);
        StringBuilder s = new StringBuilder("java");
        sb.append(s);
        System.out.println(sb==sb1);  // muttable
    }

    private static void StringImmutable() {
        if(str==str2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");  //immutable
        }
        str += "Java";
        if(str==str2){
            System.out.println("Equal");
        }
        else{     // immutable
            System.out.println("Not equal");
        }
    }
}
