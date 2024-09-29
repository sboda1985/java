import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {

        MyCalendarTwo calendar = new MyCalendarTwo();
        // 10, 20], [50, 60], [10, 40], [5, 15], [5, 10], [25, 55]
        // true, true, true, false, true, true
        boolean result = calendar.book(10,20);

        result = calendar.book(50,60);

        result = calendar.book(10,40);

        result = calendar.book(5,15);

        result = calendar.book(5,10);

        result = calendar.book(25,55);



    }
}