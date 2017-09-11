public class Main {

    public static void main(String[] args) {
        int[] ranges = {26, 52, 62, 67, 72};
        printTable(5, ranges);
    }

    public static void printTable(int rows, int[] columnValues){
        printHeading(columnValues);
        for(int i = 1;i<=rows;i++){
            System.out.printf("L=%2d", i);
            for(int j=0;j<columnValues.length;j++){
                System.out.printf("%9.1f",(double)Math.log(columnValues[j]+i));
            }
            System.out.println();
        }
    }
    public static void printHeading(int[] columnValues){
        System.out.print("++++");
        for(int i=0;i<columnValues.length;i++){
            System.out.printf(".....R=%2d", columnValues[i]);
        }
        System.out.println();
    }

}
