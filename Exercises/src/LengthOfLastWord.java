public class LengthOfLastWord{
public int lengthOfLastWord(String s) {
    int length = -1;
    for (int i = s.length() - 1; i >= 0; i--) {
        if (s.charAt(i) != ' ') {
            length++;
        }
        if (s.charAt(i) == ' ') {
            if(length > -1){
                return length+1;
            }
        }
    }
    return 0;
}
}
