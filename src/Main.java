public class Main {

    public static void main(String[] args) {

        int number;
        String word;
        String[] words;

        System.out.printf("There are %d words on the command line.\n", args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
