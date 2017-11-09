import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MainTest {
    static ArrayList<Zombie> list;
    static ArrayList<Zombie> hugeList;


    @BeforeClass
    public static void  runOnce() throws Exception{
        hugeList = new ArrayList();
        System.out.println("The path separator is " + File.separator);
        Scanner input = new Scanner(new File("tests"+File.separator+ "testPirates.txt"));
        while(input.hasNextLine()){
            String s = input.next();
            hugeList.add(new Zombie(s));
        }
        input.close();
        for(Zombie z: hugeList){
            System.out.println(z);
        }
    }

    @Test
    public void lazySort() throws Exception {
        Main.lazySort(list);
        Main.lazySort(hugeList);
        System.out.println("lj;lj;klj;klj;klj;klj;klj;kl");
        for(Zombie z: hugeList){
            System.out.println(z);
        }
        assertEquals("Abe",list.get(0).getName());
        assertEquals(25.001,list.get(0).getHealth(),0.01);
        assertEquals("a",hugeList.get(0).getName());
    }

    @Before
    public void setUp() throws Exception {
        list = new ArrayList();
        list.add(new Zombie("Sam"));
        list.add(new Zombie("Sam", 25.0));
        list.add(new Zombie("Sam", 55.0));
        list.add(new Zombie("Sam", 25.0));
        list.add(new Zombie("Sam", 25.0));
        list.add(new Zombie("Sue", 25.0));
        list.add(new Zombie("bob", 25.0));
        list.add(new Zombie("Abe", 25.0));
        list.add(new Zombie("Ted", 25.0));

    }

    @After
    public void tearDown() throws Exception {
    }

}