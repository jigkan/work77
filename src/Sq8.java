import java.util.Scanner;

public class Sq8 {
    //8. Write a java program to get numbers from users and print whether it is positive or negative.
public static void main (String []args){

  number();
}
    public static void number(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter number: ");
        int a = sc.nextInt();
        if (a<0){
            System.out.println("it is negative ");}
            else{ System.out.println("it is positive ");}
        }
    }


