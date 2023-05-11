import java.util.Scanner;

public class Sq7 {
    //7. Write a java program to input any number and find out if it’s odd or even.
    public static void main( String []args){
number();
    }
    public static void number(){
        Scanner sc =new  Scanner(System.in);
        System.out.println("Enter number is :");
        int innumber = sc.nextInt();
        boolean result =  innumber%2==0;


        if (innumber/2!=0){
         System.out.println(innumber + "   Input number is : odd");}
           else if (innumber/2==0) { System.out.println(innumber + " Input number is : even");

        }

}}
