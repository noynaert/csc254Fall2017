public class Main {

    public static void main(String[] args) {
	 Object obj = new Object();
	 Object thing1 = new Object();
	 Object thing2 = obj;

	 System.out.println(obj.toString());
	 System.out.println(thing1);
	 System.out.println(thing2);
	 System.out.println(obj.equals(thing1));
	 System.out.println(obj.equals(thing2));
	 System.out.println(obj == thing1);
        System.out.println(obj == thing2);
        System.out.println(obj.hashCode());
        System.out.println(thing1.hashCode());
        System.out.println(thing2.hashCode());
        System.out.println(obj.getClass());

        System.out.println("-------------------");
        Rectangle box = new Rectangle();
        box.setLength(-3.0);
        box.setWidth(5.0 / 2.0);
        System.out.printf("Length: %f, Width: %f\n", box.getLength(), box.getWidth());
        System.out.println(box);
        Rectangle simple = new Rectangle();
        System.out.println(simple);
    }
}
