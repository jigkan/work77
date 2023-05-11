public class Sq22 {
    //22. Write a Java program to calculate the average value of array elements.
    public static void main(String []args){
        int [] number = { 34,56,76,88,55};
        int sum = 0;
        for(int i=0; i < number.length ; i++)
            sum = sum + number[i];
        //calculate average value
        double average = sum / number.length;
        System.out.println("Average value of the array elements is : " + average);
    }
    }

