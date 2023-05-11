import java.util.Scanner;

public class Sq11 {
    //Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
    //other alphabet should be invalid entry.
    public static void main(String []args){
alphabet();

    }
    public static void alphabet(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any alphabet from A  to F ");
        char a = sc.next().charAt(0);
        if (a=='A'){
            System.out.println("their city name Ahmedabad ");  }
        else if (a=='B') {System.out.println("their city name Bombay ");  }
        else if (a=='C') {System.out.println("their city name Canada ");  }
        else if (a=='D') {System.out.println("their city name Div ");  }
        else if (a=='E') {System.out.println("their city name Edar ");  }
        else if (a=='F') {System.out.println("their city name France ");  }
        else  {System.out.println("it is invalid entry,please Enter any alphabet from A  to F ");  }


    }

    }

