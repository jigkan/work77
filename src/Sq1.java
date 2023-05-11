import java.util.Scanner;

public class Sq1 {
    /*
    Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)
     */

    public static void main(String []args){
    number();
    }
    public static void number(){
        Scanner sc =new  Scanner(System.in);
        System.out.println("Enter number is :");
        int innumber = sc.nextInt();
        String result =  innumber%2==0 ? " Input number is odd" :" Input number even";
        System.out.println(innumber  + result);

        //if (innumber/2!=0){
          //  System.out.println(innumber + "Input number is : odd");}
            //   else if (innumber/2==0) { System.out.println(innumber + "Input number is : even");

            //}

            }
        }


