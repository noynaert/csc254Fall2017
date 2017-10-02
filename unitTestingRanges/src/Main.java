public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean hasDigit(String s){
        boolean found = false;
        char ch = '0';
        while(ch <= '9' && !found){
            found = s.indexOf(ch) > -1;
            ch++;
        }
        return found;
    }
    public static int countSpecial(String s, String target){
        int count = 0;
        for(int i=0;i<target.length();i++){
            char ch = target.charAt(i);
            if(s.indexOf(ch) > 0){
                count++;
            }
        }
        return count;
    }
}
