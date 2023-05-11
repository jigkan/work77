import java.util.Scanner;

public class Sq19 {
//19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”

    public static void main(String []args){
     number();
    }
    public static void number(){
        Scanner sc= new Scanner(System.in);
        System.out.println("please Enter number: ");
        int a= sc.nextInt();
        if (a>0){
            System.out.println(" it is POSITIVE");}
        else if (a<0) {System.out.println(" it is NEGATIVE");}
        else if (a==0) {System.out.println(" it is Zero");}

}
    }





