import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MyCalendarTwo {


        private final Set<Integer> data = new HashSet<>();
        private final Set<Integer> collisions = new HashSet<>();
        public MyCalendarTwo() {

        }

        public boolean book(int start, int end) {

            boolean foundConflict = false;
            for(int i = start; i<end; i++) {
                if (data.contains(i)) {
                    if (collisions.contains(i)) {
                        return false;
                    }
                }
            }
            for(int i = start; i<end; i++) {
                if (data.contains(i)) {
                    collisions.add(i);
                } else {
                    data.add(i);
                }
            }
             return true;
        }
    }

