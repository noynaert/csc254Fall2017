public class Main {

    public static void main(String[] args) {

        String s = "abcDEF123z?";

//        for(int i = 0;  i<s.length(); i++){
//            System.out.printf("The character at %d is %c\n", i, s.charAt(i));
//        }
//        for(char ch = 'a'; ch < 'z'; ch++){
//            System.out.printf(" %c %d\n", ch-32, (int)ch-32);
//        }
//
//        char ch = ' ';
//        while(ch < '~'){
//            System.out.printf("%c %d\n", ch, s.indexOf(ch));
//            ch++;
//        }
         System.out.println( contains(s, 'a', 'b'));

    }

    public static boolean contains(String s, char start, char end){
        boolean found = false;

        char ch = start;
        while(!found && ch <= end){
            found = (s.indexOf(ch) > -1);
            ch++;
        }


        return found;
    }
}
