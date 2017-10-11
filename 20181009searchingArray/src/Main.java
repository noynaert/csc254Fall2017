public class Main {
    public final static double DELTA = 0.001;

    public static void main(String[] args) {
    }
    public static boolean contains(double needle, double[] haystack, int n){
        boolean found = false;
        int i=0;
        while( i<n && !found ){
            //if(needle == haystack[i]){
            if(closeEnough(needle, haystack[i], DELTA)){
                found = true;
            }
            i++;
        }
        return found;
    }
    public static boolean closeEnough(double a, double b, double delta){
        double difference = Math.abs(a-b);
        return (difference < delta);
    }

    public static int countSpecialCharacters(String password){
        int count = 0;
        String special = "! \" #$%^'()*+,-./:;<=>?@[\\)^_`{}|~";
        for(int i=0;i<special.length();i++){
            char ch = special.charAt(i);
            if(password.indexOf(ch) > -1){
                count++;
            }
        }

        return count;
    }
}
