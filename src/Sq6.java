import java.util.Scanner;

public class Sq6 {
    /*
    WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
| Salary Slip |
| |
| |
| Employee Id : 2564 |
| Employee Name : Jay |
|
|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|
|
| Gross Salary : 26750.0 |
|===========================|
     */

    public static void main (String []args){
        salaryslip();
    }
    public static void salaryslip(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id : ");
        int id = sc.nextInt();
      System.out.println("Enter Employee name : ");
        String name= sc.next();
        System.out.println("Enter Basic salary : ");
         double salary= sc.nextDouble();
         double HRA= salary/10;

        double DA= salary/8;

        double TA= salary/9;

        double PF= salary/20;

        double Gross= salary+HRA+DA+TA-PF;



        System.out.println("|     Salary Slip         |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|Employee Id   :" + id +"      |");
        System.out.println("|Employee Name :" +name+ "   |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("| Basic salary :" + salary + "   |");
        System.out.println("|HRA 10%       :" + HRA + "     |");
        System.out.println("|DA   8%       :" + DA + "     |");
        System.out.println("|TA   9%       :" + String.format("%.2f",TA)+ "       |");
        System.out.println("|PF   -20%     :" + PF+"       |");
        System.out.println("|                         |");
        System.out.println("|                         |");
        System.out.println("|Gross salary  :" + String.format("%.2f",Gross)+ "    |");
        System.out.println("============================");

    }
}
