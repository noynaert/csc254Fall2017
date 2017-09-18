public class Main {

    public static void main(String[] args) {
	  String[] words = {"Dog", "Cat", "Fish", "Bird", "Cat"};
	  boolean found = contains("dog",words, words.length);
	  System.out.println(found);
    }

    private static boolean contains(String target, String[] list, int n) {
         boolean found = false;

         int i = 0;
         while(!found && i<n) {
             found = (  target.equalsIgnoreCase(list[i])  );
             //found = target.toLowerCase().equals(list[i].toLowerCase());
             i++;
         }
         return found;

    }


}
