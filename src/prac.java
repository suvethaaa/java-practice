class prac {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(findMin(nums));
    }
    static int findMin(int[] nums) {
        int pivot = 0 ;
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        if(n>1){
            pivot = pivot (nums);
        }
        if(pivot == -1){
            return nums[0];
        }else if (pivot >=0 ){
            return nums[pivot+1];
        }
        return nums[0];
    }

    static int pivot(int[] nums){
        int start = 0 ;
        int end = nums.length-1;

        while(start<end){
            int mid =start +(end - start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]>nums[start]){
                start = mid+1;
            }
            if(nums[mid]<nums[end]){
                end = mid-1;
            }
        }
        return -1;
    }
}