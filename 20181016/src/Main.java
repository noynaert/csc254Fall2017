public class Main {

    public static void main(String[] args) {


       Rectangle big = new Rectangle();
       Rectangle small = new Rectangle();
       Rectangle square = new Rectangle();
       big.setLength(100.0);
       big.setWidth(50.0);
       small.setLength(1.);
       small.setWidth(0.5);
       square.setLength(5.);
       square.setWidth(5.);


       System.out.println(big);
       System.out.println(small);
       System.out.println(square);
       System.out.println(printRectangle(big));
       System.out.println(printRectangle(small));
       System.out.println(printRectangle(square));

       Rectangle odd = new Rectangle();
       odd.setLength(-5);
       odd.setWidth(12.);
       System.out.println(odd);
       System.out.println(printRectangle(odd));


    }
    public static String printRectangle(Rectangle box){
        return String.format("Length: %f, Width: %f, Area: %f", box.getLength(), box.getWidth(),
                box.getArea());
    }
    public static String isItEven(int number){
        return (number % 2 == 0)  ? "Yes" : "No";
    }

    /**
     * Return the max of two numbers
     */
    public static int max(int num1, int num2) {
        int result;

       // result = -1;    //unary operator
       // result = 2+3;   //binary operator

        result = (num1 > num2) ? num1 : num2;  //ternary operator, conditional operator
/*
        if (num1 > num2)
            result = num1;
        else
            result = num2;
*/
        return result;
    }
}
