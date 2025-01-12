package lv.rvt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Box box = new  Box( 2.5, 5.0, 6.0 ) ;
        System.out.println( "Area: "  + box.area() + " volume: " + box.volume() );

        Box box2 = new Box(box);
        System.out.println( "Area: "  + box2.area() + " volume: " + box2.volume() );
        
        Box smallBox = box.smallerBox(box);
        System.out.println( "Area: "  + smallBox.area() + " volume: " + smallBox.volume() );

        Box bigBox = box.biggerBox(box);
        System.out.println( "Area: "  + bigBox.area() + " volume: " + bigBox.volume() );

        System.out.println(smallBox.nests(bigBox));
        System.out.println(bigBox.nests(box));
    }
}