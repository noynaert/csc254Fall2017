public class Main {

    public static void main(String[] args) {
        double[] list = {3.14159, 0.0, -3, 1.41459, 88., -3.14159, -2.7};

        System.out.println("The smallest item is " + findMinimum(list, list.length));

    }
    public static String findMinimum(String[] list, int n){
        String smallestSoFar =  "~~~~~~~~";
        for(int i = 0; i<n; i++){
            if(list[i].compareToIgnoreCase(smallestSoFar) < 0  ){
                smallestSoFar = list[i];
            }
        }
        return smallestSoFar;
    }

    public static double findMinimum(double[] list, int n){
        double smallestSoFar = Double.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(list[i] < smallestSoFar){
                smallestSoFar = list[i];
            }
        }
        return smallestSoFar;
    }
}
