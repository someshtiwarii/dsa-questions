public class secondLargest {

    public static void main(String[] args) {
        String s = "6578hjgcfxch65r6789";
        int result = function(s);
        System.out.println("second highest number is = " + result);
    }

    public static int function(String s) {
        int largest = -1;
        int second_largest = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                if (digit > largest) {
                    second_largest = largest;
                    largest = digit;
                } else if (digit < largest && digit > second_largest) {
                    second_largest = digit;
                }
            }
        }
        return second_largest;
    }
}
