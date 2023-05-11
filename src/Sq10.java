import java.util.Scanner;

public class Sq10 {

    //10. Write a java program input sales id, seller's name, sales amount, and salary basic and then
    //fined this sales
    //Commission
    //Sales amount >= 50,000 35%
    //Sales amount >= 30,000 20%
    //>= 20,000 10%
    //>= 10,000 5%
    //< 10,000 2%
    public static void main(String[] args) {
        commission();
    }

    public static void commission() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter sales ID :");
        int Sales_id = sc.nextInt();
        System.out.println("please enter seller name :");
        String seller_name = sc.next();
        System.out.println("please enter sales amount :");
        int sales_amount = sc.nextInt();
        System.out.println("please enter salary basic :");
        int salary_basic = sc.nextInt();
        if (sales_amount >= 50000) {
            System.out.println("your salary with commission =" + ((salary_basic * 35) / 100 + salary_basic));
        } else if (sales_amount >= 30000) {
            System.out.println("your salary with commission =" + ((salary_basic * 20) / 100 + salary_basic));
        } else if (sales_amount >= 20000) {
            System.out.println("your salary with commission =" + ((salary_basic * 10) / 100 + salary_basic));
        } else if (sales_amount >= 10000) {
            System.out.println("your salary with commission =" + ((salary_basic * 5) / 100 + salary_basic));
        } else {
            System.out.println("your salary with commission =" + ((salary_basic * 2) / 100 + salary_basic));
        }
    }
}
