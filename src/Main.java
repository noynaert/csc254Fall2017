import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fileName;
        int maxSize = 6;   //The limit on the number of items to read
        int n;         //The actual number of doubles read.
        double[] list = new double[maxSize];

        fileName = fetchFileName(args);
        maxSize = fetchMaximumSize(args);

        System.out.printf("Reading from file %s\n", fileName);
        System.out.printf("Trying to read %d numbers\n", maxSize);

        n = readDoubles(5, fileName, list);
        print(list, n);

        double target = -3.141592653;
        boolean found = contains(target, list, n);
        System.out.printf("Does the list contain %f? %b\n", target, found);
    }
    public static boolean closeEnough(double a, double b, double tolerance){
        boolean same;
        same = (Math.abs(a - b) < tolerance);
        return same;
    }

    public static boolean contains(double target, double[] list, int n){
        boolean found = false;

        int i = 0;
        while(!found && i < n){
            //found = (target == list[i]);
            found = closeEnough(target,list[i],0.001);
            i++;
        }
        return found;
    }

    public static int fetchMaximumSize(String[] args){
        int maxSize = 100;
        if(args.length>1){
            maxSize = Integer.parseInt(args[1]);
        }
        return maxSize;
    }

    public static void print(double[] list, int n){
        System.out.printf("I am printing %d numbers\n", n);
        for(int i=0;i<n;i++){
            System.out.printf("[%d] %f\n", i, list[i]);
        }
        System.out.println("-------------------------");
    }
    public static String fetchFileName(String[] args){
        String fileName;
        int count = args.length;

        if (count > 0) {
            fileName = args[0];
        }else{
            fileName = "input.txt";
        }
        File testFile = new File(fileName);
        if(!testFile.exists()){
            System.out.printf("The file \"%s\" does not exist.  Aborting!\n", fileName);
            System.exit(1);
        }
        return fileName;
    }
    public static int readDoubles(int limit, String fileName, double[] list){
        int n = 0;

        try {
            Scanner input = new Scanner(new File(fileName));
            while(input.hasNextDouble() && n < limit){
                double number = input.nextDouble();
                //System.out.printf( "[%d] is %f\n", n, number);
                list[n] = number;
                n++;

            }

            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return n;
    }
}


