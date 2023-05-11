public class Sq3 {
    //3. Declare multidimensional array and store 5 countries
    // and their capital and print them in console.

    public static void main(String[] args) {

        {
            String multinational[][] = {{"India", "America", "Germany", "France", "Spain"},
                                        {"Delhi", "New York", "Gujarat", "Paris", "Surat"}};
            System.out.println(multinational[0][0]+" Capital is -"+ multinational[1][0]);
            System.out.println(multinational[0][1]+" Capital is -" + multinational[1][1]);
            System.out.println(multinational[0][2]+" Capital is -"+multinational[1][2] );
           System.out.println(multinational[0][3] +" Capital is -" +multinational[1][3]);
            System.out.println(multinational[0][4]+" Capital is -"+ multinational[1][4]);

        }
    }
}
