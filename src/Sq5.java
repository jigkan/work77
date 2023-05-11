import java.util.Scanner;

public class Sq5 {
    /*
    Write a java program to input student Name, roll No, and three subjects Math, Science and English
 marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
 should between 0 to 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format


 */
    public static void main(String[] args) {
        student();
    }

    public static void student() {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter Student Name :" );
        String student_name = sc.next();

         System.out.println("Enter Student roll No :"  );
         int student_rollno =sc.nextInt();
        System.out.println("Math         :");
        int math = sc.nextInt();
        if (math <= 100 && math >= 0) {
            System.out.println(math);
        } else {
            System.out.println("error message “InvalidInput, Marks\n" +
                    "should between 0 to 100”");

         //   System.out.println("Math         :");
           // sc.nextInt();
        }

         System.out.println("Science :" );
        int science = sc.nextInt();
        if (science <= 100 && science >= 0) {
            System.out.println(science);
        } else {
            System.out.println("error message “InvalidInput, Marks\n" +
                    "should between 0 to 100”");
            System.out.println("science         :");
            sc.nextInt();
        }

        System.out.println("English :" );
         int english =sc.nextInt();
        if (english <= 100 && english >= 0) {
            System.out.println();
        } else {
            System.out.println("error message “InvalidInput, Marks\n" +
                    "should between 0 to 100”");
            System.out.println("English         :");
            sc.nextInt(english);

        }
        int total= math + science + english;
        double percentage= total/3;
        String results;
        if  (percentage >=35){
            results = "pass";}
            else{
                results= "Fail";
            }



        System.out.println( "_________________________________________________");
        System.out.println("|                                                 |");
        System.out.println("|                     MarkSheet                   |");
        System.out.println("|                                                 |");
        System.out.println("|    Name         :" + student_name +"                            |");
        System.out.println("|    Roll No      :" + student_rollno +"                          |");
        System.out.println("|_________________________________________________|");
        System.out.println("|    Subject      :" + "   Marks                       |");
        System.out.println("|__________________________________________________|");
        System.out.println("|    Math         :" + math +"                            |");
        System.out.println("|    science      :" + science + "                        |");
        System.out.println("|    English      :" + english + "                        |");
        System.out.println("|_________________________________________________|");
        System.out.println("|    Total        :" + total +"                           |");
        System.out.println("|________________________________________________|");
        System.out.println("|    Percentage   :" +   percentage +    "                |");
        System.out.println("|    Result       :" +    results +   "                   |");
        if (percentage>=80){
            System.out.println("|Garde       :        Grade A+                    |");
        } else if (percentage>=60) {
            System.out.println("|Garde       :        Grade A                    |");
        } else if (percentage>=50) {
            System.out.println("|Garde       :        Grade B                    |");
        } else if (percentage>=35) {
            System.out.println("|Garde       :        Grade C                    |");
        }else {
            System.out.println("|                      Fail                    ");
        }




    }


    }

