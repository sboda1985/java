import java.util.*;

public class MaximumSwap {
    private int replace(List<Integer> originals, int left, int right){

        int aux = originals.get(left);
        originals.set(left, originals.get(right));
        originals.set(right, aux);
        Collections.reverse(originals);
        aux = 0;
        for(int index = originals.size()-1; index >=0; index--){
            aux = aux*10 + originals.get(index);
        }
        return aux;
    }

    public int maximumSwap(int num) {
        int temp = num;

        List<Integer> numbers = new ArrayList<>();
        List<Integer> originals = new ArrayList<>();
        while(temp > 0){
            numbers.add(temp%10);
            originals.add(temp%10);
            temp = temp/10;
        }
        Collections.sort(numbers);
        Collections.reverse(numbers);
        Collections.reverse(originals);
       int nr = 0, prev = -1;
        for(int index = 0; index < numbers.size(); index++){

           if (numbers.get(index) != originals.get(index)){
                return replace(originals, index, originals.lastIndexOf(numbers.get(index)));
            }
           prev = numbers.get(index);
        }

        return num;
    }

}
