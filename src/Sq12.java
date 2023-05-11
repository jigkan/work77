import java.util.Scanner;

public class Sq12 {
   // 12.
    //Input any alphabet from “A" to “F” and print their city name accordingly (use switch statement) ifany
    //other alphabet should be invalid entry.
    public static void main(String []args){
       alphabet();
    }
    public static void  alphabet(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any alphabet from A  to F   ");
        char a = sc.next().charAt(0);
      switch (a){
          case 'A':
              System.out.println("their city name Ahmedabad ");
              break;
          case 'B':System.out.println("their city name Bombay ");
              break;
              case'C':System.out.println("their city name Canada ");
              break;
          case 'D':System.out.println("their city name Div ");
          break;
          case 'E':System.out.println("their city name Edar ");
          break;
          case'F': System.out.println("their city name France ");
          break;
          default:
          System.out.println("it is invalid entry,please Enter any alphabet from A  to F ");




      }


    }
}
