import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to metric converter!");
        
        int query;
        int converted_query;
        double degree_query;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please input your query unit (-1 to exit). 1 for kilometers to meters");
        System.out.println("2 for feet to inches");
        System.out.println("3 for Fahrenheit to Celsius");
        System.out.println("4 for miles to yards");
        System.out.println("5 for Celsius to Fahrenheit");

        query = scanner.nextInt();

        if (query == -1) {
            scanner.close();
        } else

        if (query == 1) {
            System.out.println("How many kilometers?");
            query = scanner.nextInt();
            converted_query = query * 1000;
            System.out.println("The result is: " + query + " km = " + converted_query + " m.");
        }

        if (query == 2){
            System.out.println("How many feet?");
            query = scanner.nextInt();
            converted_query = query * 12;
            System.out.println("The result is: " + query + " ft = " + converted_query + " in.");
        }
        
        if (query == 3){
            System.out.println("How many degrees (Fahrenheit)?");
            query = scanner.nextInt();
            degree_query = (query - 32) / 1.8;
            System.out.println("The result is: " + query + " degrees (Fahrenheit) = " + degree_query + " degrees (Celsius).");
        }

        if (query == 4){
            System.out.println("How many miles?");
            query = scanner.nextInt();
            converted_query = query * 1760;
            System.out.println("The result is: " + query + " mile = " + converted_query + " yards.");
        }

        if (query == 5){
            System.out.println("How many degrees (Celsius)?");
            query = scanner.nextInt();
            degree_query = (query * 1.8) + 32;
            System.out.println("The result is: " + query + " degrees (Celsius) = " + degree_query + " degrees (Fahrenheit).");
        }
    }
}
