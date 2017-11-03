import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person prince = new Person("Prince", 63.);
        Person devito = new Person("Danny DeVito");
        Person formerly = new Person("Prince", 63.);

        String[] words = new String[5];
        Person[] people = new Person[5];
        int n = readPeople(people,5);
        print(people, n);
        readZips();

    }
    public static void print(Person[] list, int n){
        System.out.println("-----------------------");
        for(int i=0;i<n;i++){
            System.out.println(list[i]);
        }
    }
    public static int readPeople(Person[] list, int limit){
        int n = 0;
        try {
            Scanner input = new Scanner(new File("input.txt"));
            while(n < limit && input.hasNextLine()){
                String line = input.nextLine().trim();
                String[] fields  = line.split(":");
                //list[n++] = new Person(fields[0], Double.parseDouble(fields[1]));
               if(fields.length == 2) {
                   String name = fields[0].trim();
                   double height = Double.parseDouble(fields[1]);
                   Person p = new Person(name, height);
                   list[n] = p;
                   n++;
               }
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return n;
    }


 public static int readZips(){
        int n = 0;
        try {
            Scanner input = new Scanner(new File("zips.txt"));
            while( input.hasNextLine()){
                String line = input.nextLine().trim();
                String[] fields  = line.split("\\t");
                //list[n++] = new Person(fields[0], Double.parseDouble(fields[1]));
                if(fields.length == 5) {
                    double latitude = Double.parseDouble(fields[1]);
                    double longitude = Double.parseDouble(fields[2]);
                    System.out.printf("%6d, %s %6.1f %6.1f %s %s\n",n, fields[0],latitude, longitude, fields[4], fields[3]);

                    n++;
                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return n;
    }

}
