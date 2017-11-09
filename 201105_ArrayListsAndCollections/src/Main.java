import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Zombie a = new Zombie("Dave", 99);
        Zombie b = new Zombie("Dave", 90.);
        Zombie c = new Zombie("Tony", 30.);
        Zombie d = new Zombie("Dave");
        Zombie e = new Zombie("Amie");
        Zombie f = new Zombie();

        Object o = new Object();
        System.out.println(o.toString());
        System.out.println(o.hashCode());


        System.out.println(a);
        System.out.println(d);
        System.out.println(f);
        System.out.println("---------------------");
        ArrayList<Zombie> hoard = new ArrayList();
        hoard.add(a);
        hoard.add(b);
        hoard.add(c);
        hoard.add(d);
        hoard.add(e);
        hoard.add(f);
        hoard.add(new Zombie("Stan"));
        hoard.add(new Zombie("Barb"));

        //hoard.add(new Object());

        ArrayList<Object> boringList;
        boringList = new ArrayList();
        boringList.add(o);
        boringList.add(new Object());
        boringList.add(a);
        boringList.add("Treasure ho! endure to be fighted.");
        boringList.add(new Double(12.34));
        print(boringList);
        hoard.add(new Zombie());
        hoard.add(new Zombie());
        hoard.add(new Zombie("Tony"));
        hoard.add(a);
        hoard.add(a);
        hoard.add(a);
        hoard.add(a);
        hoard.add(a);
        print(hoard);
        Collections.sort(hoard);
        print(hoard);

    }

    public  static <T> void print(ArrayList<T> list) {
        System.out.println("--=-=-=-=-=-=-=-=-=-=-=-=-=-");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("[%d] %s\n", i, list.get(i));
        }
        System.out.println("Size is " + list.size());
    }

    public static void printZombies(ArrayList<Zombie> list) {
        System.out.println("--=-=-=-=-=- THE HOARD IS COMING! =-=-=-=-=-=-=-=-");
        for (Zombie z : list) {
            System.out.printf("%s is at %d\n", z, list.indexOf(z));
        }
        System.out.println("Size is " + list.size());
    }

    //public static void selectionSort(double[] list, int n){
//    public static void selectionSort(ArrayList<Zombie> list) {
//        for (int i = 0; i < list.size() - 1; i++) {
//            Zombie currentMin = list.get(i);
//            for (int j = i + 1; j < list.size(); j++) {
//                if (currentMin.compareTo(list.get(j)) < 0) {
//
//                }
//            }
//        }

    public static void lazySort(ArrayList<Zombie> list){
        Collections.sort(list);  //Imagine this is a sort that has not been tested.
    }
}
