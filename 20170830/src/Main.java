import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   String fileName = "input.txt";
	   File inputFile = new File("input.txt");
        try {
            Scanner input = new Scanner(inputFile);

            int smallestSoFar = Integer.MAX_VALUE;
            int n = 0;
            int sum = 0;

            while(input.hasNext()) {
                int number = input.nextInt();
                sum += number;
                System.out.printf("I got %d\n", number);

                if (number < smallestSoFar) {
                    smallestSoFar = number;
                }
                //n = n + 1;
                //n += 1;
                // ++n;
                n++;
            }
            input.close();
            double average = findAverage(sum,n);
            System.out.println("The smallest number I found was " + smallestSoFar);
            System.out.printf("I read %d integers\n", n);
            printSum(sum);
            System.out.printf("The average is %f\n", average);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("File not found, Aborting!!");
            System.exit(1);
        } catch (InputMismatchException e){
            System.out.println("...");
        }
        System.out.println("I am still running!");
    }

    public static double findAverage(int sum, int n){
        double average = (double)sum / (double)n;
        return average;
    }
    public static void printSum(int sum){
        System.out.printf("The sum is %10.2f\n",sum);
    }
}
