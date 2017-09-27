public class Main {

    public static void main(String[] args) {
	    //printToN(30);
	    System.out.println();
	    //printToN(Integer.MAX_VALUE);
	    printSquare(5);
	    printTriangle(10);

    }
    public static void printTriangle(int n){
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i; j< n; j++){
                System.out.print("*");
                count++;
            }
            System.out.println();
        }
        System.out.printf("Innermost loop printed %d times\n", count);
    }
    public static void printSquare(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                System.out.printf("%c", 'A' + i);
            }
            System.out.println();
        }
    }
    public static void printToN(int n){
        for(int i=0;i <(n/2); i++){
            if(i%1000 == 0)
                System.out.print(".");
        }
    }
}
