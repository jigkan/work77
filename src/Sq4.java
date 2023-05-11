import java.util.Scanner;

public class Sq4 {
    //4. Write if else condition and print your group name in console else others group name.
    public static void main(String []args){
    gname();
    }


    public static void gname() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter group name:- ");
       String name = sc.next();
       String name1 = "selenium", name2 ="java", name3= "postman";


         if (name.equals(name1)){
         System.out.println("other group name ="+ name2  +"  " + name3);}
         else if (name.equals(name2)) {
             System.out.println("other group name ="+ name1  +"  " + name3);}
       else if (name.equals(name3)){
            System.out.println("other group name ="+ name1  +" " + name2);}
       else { System.out.println( "thanks to for joining");}

    }}


        //else {System.out.println(name2);}



