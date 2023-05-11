public class Sq15 {
    //15. Write a programi that tells us input value is number or an alphabet or symbol.
    public static void main(String []args){
      number();
    }
    public static void number(){
       String a="++";

          char ch=a.charAt(0);
            if(ch >= 'A' && ch <='Z'){
            System.out.println("it is alphabet");}
            else if (ch >= '0' && ch <='9') {
                System.out.println("it is numerical");}
            else {System.out.println("it is symbol");}

            }

    }









