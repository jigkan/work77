import java.util.Scanner;

public class Sq26 {
    //26. Write a Java program to reverse a word.
    //Sample Output:
    //Input a word: dsaf
    //Reverse word: fasd
    public static void main(String []args){
   d();

    }
    public static void d(){
        Scanner sc= new Scanner(System.in);
        System.out.println("please enter number");
            String word= sc.next();
             String reverse = new StringBuffer(word).reverse().toString();
        System.out.println("reverse print=" + reverse);
    }

}
