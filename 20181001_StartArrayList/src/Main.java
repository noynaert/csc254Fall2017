import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String>  list = new ArrayList<>();
        read(list);
        list.trimToSize();
        list.sort(String::compareToIgnoreCase);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static void read(ArrayList<String> list){
        try {
            Scanner input = new Scanner(new File("input.txt"));

            while(input.hasNextLine()){
                String line = input.nextLine().trim();
                list.add(line);
            }

            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
