public class Sq14 {
    //14. Write a java program to print the numbers between 1 to 100 which can be divided by 3and
    //5 separately.
    public static void main(String []args){
        number();
    }
    public static void  number(){

        for (int i=1; i<100; i++){
            if (i%3==0){
            System.out.println("Divide by 3=" + i);}}
            for (int i=1; i<100; i++){
                if(i%5==0){
                    System.out.println("divide by 5=" + i);}}
                for(int i=1; i<100; i++) {
                    if (i % 3 ==0 && i % 5 ==0){
                        System.out.println("divide by 3 and 5 = " +i);
                }


                }
            }






}
