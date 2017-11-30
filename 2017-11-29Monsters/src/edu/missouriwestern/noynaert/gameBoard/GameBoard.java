package edu.missouriwestern.noynaert.gameBoard;



        import edu.noynaert.csc254.Entity;
        import edu.noynaert.csc254.Mobile;

        import java.util.ArrayList;
        import java.util.Random;


/**
 * Created by noynaert on 11/28/17.
 * <p>
 * Gameboard has Cells.  Cell is an inner class.
 * <p>
 * Each Cell contains an ArrayList, but the list may not contain more variables
 * than is defined in the static variable maximumCellSlots.
 */
public class GameBoard {
    private static int maximumCellSlots = 3;
    private static int maximumCellWidth = 20;
    private int rows;
    private int columns;
    private Cell[][] board;

    public GameBoard(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        board = new Cell[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = new Cell();
            }
        }

    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    /**
     * print attempts to print the grid.  It works find until we start messing with
     * fancy unicode characters that have a little different width than other
     * characters.   As it is, the grid is still readable, if not pretty.
     * <p>
     * Next semester I will probably try to display the grid as panes in a javafx
     * window.
     */

    public void play(int numberOfRounds) {
        for (int i = 0; i < numberOfRounds; i++) {
            System.out.println("Round " + i);
            round();
            print();
        }
    }

    public void print() {
        //The first symbol on the line is the heavy plus.
        //Copy it from https://emojipedia.org/heavy-plus-sign/
        String horizontal =
                "➕-----------------------------------".substring(0, maximumCellWidth - 1);
        String padding = "                                   ";
        for (int row = 0; row < rows; row++) {
            //Print the top row
            for (int col = 0; col < columns; col++) {
                System.out.print(horizontal);
            }
            System.out.println("+");
            for (int slot = 0; slot < maximumCellSlots; slot++) {
                String s = "";
                for (int col = 0; col < columns; col++) {
                    //Print each slot of each cell

                    if (slot < board[row][col].slots.size()) {
                        s = board[row][col].slots.get(slot).toString();
                    } else {
                        s = "➖";   //https://emojipedia.org/heavy-minus-sign/
                    }
                    s = "| " + s + padding;
                    s = s.substring(0, maximumCellWidth - 1);
                    System.out.print(s);
                }
                System.out.println("|");
            }


        }
        //Print the bottom row
        for (int j = 0; j < columns; j++) {
            System.out.print(horizontal);
        }
        System.out.println("+");

    }

    /**
     * This method tries to add critters to the board.  It makes up to "maxTries"
     * attempts to place each critter.  It can only place critters up to the number
     * of slots.
     *
     * @param T This should be a subclass of Entity
     * @param n The number of items we will try to place.  There are no guarantees!
     * @return The number of items actually placed.  It may be less than n
     */
    public <T> int randomFill(Class T, int n) {
        Random r = new Random();
        int crittersPlaced = 0;
        int maxTries = 10;
        T critter = null;

        for (int i = 0; i < n; i++) {
            int tries = 0;
            while (tries < maxTries) {
                int row = r.nextInt(rows);
                int column = r.nextInt(columns);
                if (board[row][column].hasCapacity()) {

                    try {
                        critter = (T) T.newInstance();
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                        System.out.println("Tried to create a bad instance");
                        System.exit(1);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                        System.out.println("Tried to create a bad instance");
                        System.exit(1);
                    }
                    board[row][column].add(critter);
                    crittersPlaced++;
                    tries = maxTries;  //Force end of loop.  Not the best style.
                }
            }
        }
        return crittersPlaced;
    }

    /**
     * Processes one round of all cells on the game board.
     */
    public void round() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                board[i][j].round(i, j);
    }
    // Cell is an "Inner Class"

    public class Cell<T> {
        ArrayList<T> slots;

        public Cell() {
            slots = new ArrayList<>(maximumCellSlots);
        }

        public boolean hasCapacity() {
            return (slots.size() < maximumCellSlots);
        }

        public boolean isFull() {
            return !hasCapacity();
        }

        /**
         * @return returns true if the was room.  false if there was not.
         */
        public boolean add(T critter) {
            boolean result = (slots.size() < maximumCellSlots);
            if (result) {
                slots.add(critter);
            }
            return result;
        }

        void remove(T critter) {
            if (slots.contains(critter))
                slots.remove(critter);
        }

        /**
         * @param startRow
         * @param startColumn Processes each critter in a cell.
         *                    If there are 0 or 1 critters in the cell, no attack happens and the critter moves if it is movable.
         *                    <p>
         *                    If there are 2 or more critters in the room then the critter in slot[1] is attacked.
         *                    The slot[1] critter never attacks itself.
         *                    <p>
         *                    The attack is then conducted.  If the critter's health drops below 10.0, it is declared dead and removed.
         */
        void round(int startRow, int startColumn) {

            try {
                for (T critter : slots) {
                    boolean dead = false;

                    //Attack management;
                    if (slots.size() > 1 && !critter.equals(slots.get(1))) {
                        Entity critter2 = (Entity) slots.get(1);
                        System.out.printf("%s attacks %s\n", critter, critter2);
                        Attack combat = new Attack();
                        combat.attack(critter, critter2);
                        critter2.subtractHealth(combat.damage);
                        String currentMessage = "\t" + combat.getMessage();
                        if (critter2.getHealth() < .10) {
                            currentMessage += " and is killed";
                            slots.remove(1);
                        }
                        System.out.println(currentMessage);
                    }

                    //Now try to move the critter if it is mobile.
                    move(critter, startRow, startColumn);
                }
            } catch (java.util.ConcurrentModificationException e) {
                //do nothing
            }
        }


        void move(T critter, int startRow, int startColumn) {
            Random r = new Random();
            int distance = 0;
            if (critter instanceof Mobile) {
                distance = ((Mobile) critter).getRange();
                if (distance > 0) {
                    int direction = r.nextInt(9);
                    int deltax = 0;
                    int deltay = 0;
                    switch (direction) {
                        case 0: //no movement
                            break;
                        case 1: //south
                            deltay = (int) Math.round(distance * Math.random());
                            break;
                        case 2: //north
                            deltay = -(int) Math.round(distance * Math.random());
                            break;
                        case 3: //east
                            deltax = (int) Math.round(distance * Math.random());
                            break;
                        case 4: //west
                            deltax = -(int) Math.round(distance * Math.random());
                            break;
                        case 5: //southeast
                            deltax = (int) Math.round(distance * Math.random());
                            deltay = (int) Math.round(distance * Math.random());
                            break;
                        case 6: //southwest
                            deltax = -(int) Math.round(distance * Math.random());
                            deltay = (int) Math.round(distance * Math.random());
                            break;
                        case 7: //northheast
                            deltax = (int) Math.round(distance * Math.random());
                            deltay = -(int) Math.round(distance * Math.random());
                            break;
                        case 8: //northwest
                            deltax = -(int) Math.round(distance * Math.random());
                            deltay = -(int) Math.round(distance * Math.random());
                            break;

                    }
                    int newRow = (startRow + deltay) % rows;
                    newRow = (newRow < 0) ? rows + newRow : newRow;
                    int newColumn = (startColumn + deltax) % columns;
                    newColumn = (newColumn < 0) ? columns + newColumn : newColumn;
                    //System.out.printf("Trying to move %s from (%d, %d) to (%d,%d)\n", critter,startRow,startColumn,newRow,newColumn);
                    if (board[newRow][newColumn].add(critter)) {
                        board[startRow][startColumn].remove(critter);
                    }
                }
            }

        }

    }

}


final class Attack {
    String message;
    double damage;

    protected <T> void attack(T aa, T bb) {
        Entity a = Entity.class.cast(aa);
        Entity b = Entity.class.cast(bb);
        message = a.getSymbol() + " ";

        //Is there an attack?
        boolean attackHappens = (Math.random() < a.getAggressiveness());
        if (attackHappens) {
            message += a.getAttackMessage() + " at " + b.getSymbol();
            damage = Math.random() * 0.5 * a.getStrength();
            message += String.format(" and does %1.2f damage", damage);
        } else {
            message += a.getPassiveMessage();
            damage = 0;
        }
    }

    String getMessage() {
        return message;
    }
}
