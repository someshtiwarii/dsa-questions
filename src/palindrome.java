public class palindrome {

    public static boolean isPalindrome(int a) {
        int acopy = a;
        int rev = 0;
        if (a < 0) {
            return false;
        }
        while (a > 0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        return rev == acopy;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(121));
    }

}
