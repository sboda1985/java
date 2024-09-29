import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LastDigitImcrease {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        if (digits[index] != 9) {
            digits[index] = digits[index] + 1;
            return digits;
        } else {
            if (digits[index] == 9 && index == 0) {
                return new int[]{0, 1};
            }

            while (digits[index] == 9) index--;

            digits[index + 1] = 1;
            for (int i = index + 2; i < digits.length; i++) digits[i] = 0;
            List<Integer> newList = Arrays.stream(digits)
                    .boxed()
                    .collect(Collectors.toList());
            newList.add(0);
            index = 0;
            int[] newDigits = new int[newList.size()];
            for (int value : newList) {
                newDigits[index] = value;
                index++;
            }
            return newDigits;
        }

    }

}
