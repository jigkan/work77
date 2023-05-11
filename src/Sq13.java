import java.util.Scanner;

public class Sq13 {
    //13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
    //find addition, Subtraction, multiplication and division according to theirsymbol(using if else)

    public static void main(String []args){
        symbol();
    }
    public static void symbol(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter one number :");
        int a = sc.nextInt();
        System.out.println("please enter second number :");
        int b = sc.nextInt();
        System.out.println("please enter any one symbol +, -, /, * :");
        char syb = sc.next().charAt(0);
        if (syb=='+'){
            System.out.println("Addition of two number is :" + (a+b) );}
        else if (syb=='-') {
            System.out.println("subtraction of two number is :" + (a-b) );}
        else if (syb=='/') {
            System.out.println("subtraction of two number is :" + (a/b) );}
        else if (syb=='*') {
            System.out.println("subtraction of two number is :" + (a*b) );}

        }


    }



