package WrapperClass_Package;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {

        int[] arr=  Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
       for(int i=0;i<args.length;i++) System.out.println(arr[i]);
    }
}
