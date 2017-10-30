public class Main {

    public static void main(String[] args) {
        Person prince = new Person("Prince", 63.);
        Person devito = new Person("Danny DeVito");
        Person formerly = new Person("Prince", 63.);

        String s ="Fred";
        String t ="Frank";


        System.out.println(   t.compareTo(s)  );

        System.out.println(prince);
        System.out.println(devito);
        System.out.println(devito.getHeight());  //Not a number
        if(devito.hasHeight()){
            System.out.println(devito.getHeight());
        }
        if(prince.hasHeight()){
            System.out.println(prince.getHeight());
        }
        System.out.println(devito.hashCode());
        System.out.println(prince.hashCode());
        System.out.println(formerly.hashCode());
    }
}
