public class smallest_in_array {

    public static int smallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for(int num : arr){
            if(num<smallest){
                smallest = num;
            }
        }
        return smallest;
    }

    public static void main(String[] args){
      int[] arr = {1,7,-8,-9,5};
      System.out.println(smallest(arr));
    }

}
