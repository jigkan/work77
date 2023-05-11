import java.util.Arrays;

public class Sq20 {
    //20. Write a Java program to sort a numeric array and a string array.

    public static void main(String []args){
        String [] name= {"jay","viru","shambha","basanti"};
        int [] number = { 55,34,65,98};
        System.out.println(" numeric array" + Arrays.toString(number) );
        Arrays.sort(number);
        System.out.println("sort numeric array" + Arrays.toString(number) );
        System.out.println(" numeric array" + Arrays.toString(name) );
        Arrays.sort(name);
        System.out.println("sort numeric array" + Arrays.toString(name) );
    }
}
