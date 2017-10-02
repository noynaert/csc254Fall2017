public class Main {

    public static void main(String[] args) {

        System.out.printf("%d squared is %d\n", 2, square(2));
        System.out.printf("%d squared is %d\n", 1, square(1));
        System.out.printf("%d squared is %d\n", 0, square(0));
        System.out.printf("%d squared is %d\n", 5, square(5));
        System.out.printf("%d squared is %d\n", 255, square(255));
        System.out.println(squareRoot(-5));

    }
    public static int square(int number){
        return number * number;
    }
    public static double squareRoot(double x){
        return Math.sqrt(x);
    }
}
