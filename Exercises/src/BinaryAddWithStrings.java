public class BinaryAddWithStrings {
    private int plusValue = 0;

    private char getDigit(char a, char b){
        if (plusValue == 0){
            if (a == '0' && b == '0'){
                return '0';
            }
            if (a == '1' && b == '1'){
                plusValue = 1;
                return '0';
            }
            return '1';
        } else {
            if (a == '1' && b == '1'){
                return '1';
            }
            if (a == '0' && b == '0'){
                plusValue = 0;
                return '1';
            }
            return '0';
        }

    }
    public String addBinary(String a, String b) {
       int aIndex = a.length() - 1;
       int bIndex = b.length() - 1;
       StringBuilder result = new StringBuilder();
    System.out.println(aIndex + " " + bIndex);
       while(aIndex >= 0 && bIndex >= 0) {
           result.append(getDigit(a.charAt(aIndex), b.charAt(bIndex)));

           aIndex--;
           bIndex--;
       }
       while(aIndex>=0){
           result.append(getDigit(a.charAt(aIndex), '0'));
           aIndex--;
       }
       while(bIndex>=0){
           result.append(getDigit(b.charAt(bIndex), '0'));
           bIndex--;
       }
        if (plusValue == 1){
            result.append('1');
        }
        return result.reverse().toString();
    }

}
