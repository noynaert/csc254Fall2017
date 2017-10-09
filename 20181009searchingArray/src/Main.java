public class Main {
    public final static double DELTA = 0.001;

    public static void main(String[] args) {
    }
    public static boolean contains(double needle, double[] haystack, int n){
        boolean found = false;
        for(int i=0; i<n; i++){
            //if(needle == haystack[i]){
            if(closeEnough(needle, haystack[i], DELTA)){
                found = true;
            }
        }
        return found;
    }
    public static boolean closeEnough(double a, double b, double delta){
        double difference = Math.abs(a-b);
        return (difference < delta);
    }
}
