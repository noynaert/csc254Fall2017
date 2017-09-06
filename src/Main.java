public class Main {

    public static void main(String[] args) {
	     double number;
	     double result;

	     number = 7.2;
	     result = calculateSquare(number);

         printValue(number, result);
         printValue(16,calculateSquare(Math.pow(4,1+1)));

        System.out.printf("Maybe the value of %f to the 6th power is %f\n", 2.0, calculateSixth(2) );

        System.out.println("The log2 of 15 is " + log2(15));

    }


    public static double log2(double number){
        double result;
        result = Math.log(number) / Math.log(2);
        return result;
    }

    public static double calculateSquare(double x){
        double result;                        //scope
        result = x * x;
        return result;  // as calculateSquare
    }
    public static double calculateCube(double number){
        return number * number * number;
    }
    public static void printValue(double original, double afterCalculation){
        System.out.printf("The square of %f is %f\n", original, afterCalculation);

    }
    public static double calculateSixth(double x){
        double result = calculateSquare(calculateCube(x));
        return result;
    }

}
