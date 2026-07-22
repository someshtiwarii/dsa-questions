public class binary_search {
    public static int binSearch(int[] nums, int target){
        int l =0;
        int h = nums.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(nums[mid]==target) return mid;
            if(target<nums[mid]){
                h = mid-1;
            }
            else if(target>nums[mid]){
                l=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,9,77,888,9999};
        System.out.println(binSearch(arr,77));
    }
}
