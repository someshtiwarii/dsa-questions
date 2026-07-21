class reverse_integer {
    public static int reverse(int x) {
        int rev= 0;
        while(x!=0){
            int b = x%10;
            if((rev>Integer.MAX_VALUE/10)||(rev<Integer.MIN_VALUE/10)) return 0;
            rev = 10*rev + b;
            x= x/10;
        }
        return rev;
    }
    public static void main(String[] args){
        int ans = reverse(-123);
        System.out.println(ans);
    }
}