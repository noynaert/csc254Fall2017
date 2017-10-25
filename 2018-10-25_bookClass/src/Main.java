public class Main {

    public static void main(String[] args) {
	   Book java = new Book();
		Book sanderson = new Book("Edgedancer");
		Book database = new Book("NORDELL SIMNET ACCESS-COMPLETE", "9781259895302", 90.00);
		Book[] shelf = new Book[20];

	   java.setIsbn(" 978-007 180-925 2");
	   System.out.println(java.getIsbn());
	   //System.out.println(java.prettyIsbn());
		System.out.println(java);
		System.out.println(sanderson);
		System.out.println(database);
	}
}
