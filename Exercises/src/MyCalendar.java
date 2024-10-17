import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class MyCalendar {

    private int[] startIndexes = new int[1000];
    private int[] endIndexes = new int[1000];
    private int nr = 0;
    public MyCalendar() {

    }

    public boolean book(int start, int end) {
        for(int i = 0; i<nr; i++){
            if (startIndexes[i] <= start && start < endIndexes[i]){
                return false;
            }
            if (startIndexes[i] < end && end <= endIndexes[i]){
                return false;
            }
            if (start <= startIndexes[i] && end >= startIndexes[i]){
                return false;
            }

        }
        startIndexes[nr] = start;
        endIndexes[nr] = end;
        nr++;
        return true;
    }
}