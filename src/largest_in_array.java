public class largest_in_array {

    public static void main(String[] args){
        int [] arr = {1,7,8,-9,6,99,8,999};
        System.out.println(largest(arr));
    }

    public static int largest(int [] arr){
        int large= Integer.MIN_VALUE;
        for(int num : arr){
            if(num>large){
                large=num;
            }
        }
        return large;
    }
}
