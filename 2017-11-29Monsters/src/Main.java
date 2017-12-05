import edu.missouriwestern.noynaert.gameBoard.GameBoard;
import edu.noynaert.csc254.Entity;
import edu.noynaert.csc254.Human;

import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int rows = 4;
        int columns = 3;
        int placed;
        //Entity sampleGeneric = new Entity();
        Human sampleHuman = new Human();
        GameBoard board = new GameBoard(rows, columns);
        demoTime();

        //testPrintableUnicode();

        board.print();
        Object o = new Object();
        //placed = board.randomFill(sampleGeneric.getClass(), 10);
        //System.out.println("GenericEntities Placed: " + placed);
        placed = board.randomFill(sampleHuman.getClass(), 10);
        System.out.println("Humans Placed: " + placed);

        board.print();
        System.out.println(sampleHuman);
        board.play(5);
    }


    public static <T> void print(ArrayList<T> list) {

        for (T t : list) {
            System.out.printf("%6d %s\n", list.indexOf(t), t);
        }
    }

    public static void testPrintableUnicode() {
        String generic = "❔"; // https://emojipedia.org/white-question-mark-ornament/
        String zombieChar = "\uD83E\uDDDF"; //https://emojipedia.org/zombie/
        String humanChar = "\uD83D\uDE42"; //https://emojipedia.org/slightly-smiling-face/
        String tigerChar = "\uD83D\uDC05"; //https://emojipedia.org/tiger/
        String plantChar = "\uD83C\uDF3F"; //https://emojipedia.org/herb/
        String manChar = "\uD83D\uDC68";
        String womanChar = "\uD83D\uDC69";
        String bunnyChar = "\uD83D\uDC30";
        String alienChar = "\uD83D\uDC7D";

        System.out.println("Generic " + generic);
        System.out.println("Zombie " + zombieChar);
        System.out.println("Human " + humanChar);
        System.out.println("Tiger " + tigerChar);
        System.out.println("Plant " + plantChar);
        System.out.println("Woman " + womanChar);
        System.out.println("Man" + manChar);
        System.out.println("Bunny " + bunnyChar);
        System.out.println("Alien" + alienChar);
    }

    //demo use of time
    public static void demoTime() {
        LocalTime time = LocalTime.now();
        int currentHour = time.getHour();
        System.out.println("The hour is " + time.getHour());
        if (currentHour < 6 || currentHour > 18)
            System.out.println("It may be dark outside\n");
        else
            System.out.println("It may be light outside\n");
    }
}
