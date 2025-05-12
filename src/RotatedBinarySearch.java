public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,1,1,1,1};
        System.out.println(search(arr,3));
    }

        static boolean search(int[] nums, int target) {
            int pivot = 0;
            if(nums.length>1){
                pivot = pivot(nums);
            }
            if(nums.length == 1){
                if (nums[0] == target) {
                    return true ;
                }else {
                    return false;
                }
            }

            if(pivot == -1){
                return binarySearch(nums,target,0,nums.length-1);
            }
            if(nums[pivot] == target){
                return true;
            }
            if(target<nums[pivot] && target < nums[nums.length-1]){
                return binarySearch(nums,target,pivot+1,nums.length-1);
            }else{
                return binarySearch(nums,target,0,pivot-1);
            }

        }

        static boolean binarySearch(int[] nums,int target , int start , int end){
            while(start<=end){
                int mid = start+(end-start)/2;
                if(nums[mid]<target){
                    start = mid+1;

                }else if(nums[mid]>target){
                    end = mid-1;
                }else if(nums[mid]==target){
                    return true;
                }
            }
            return false;
        }

        static int pivot(int[] nums){
            int start = 0;
            int end = nums.length -1;
            while(start<end){
                int mid = start+(end-start)/2;

                if(nums[mid]>nums[mid+1]){
                    return mid;
                }
                if(mid > start && nums[mid]<nums[mid-1]){
                    return mid-1;
                }
                if(nums[start]!= nums[end] && nums[start]<nums[end]){
                    return -1;
                }

                if(nums[start]==nums[mid] && nums[end]==nums[mid]){
                    if(nums[start]>nums[start+1]){
                        return start;
                    }
                    start++;
                    if(nums[end]<nums[end-1]){
                        return end-1;
                    }
                    end--;
                }
                if(nums[mid]<nums[start]||nums[mid]==nums[start] && nums[mid]<nums[end]){
                    end = mid-1;
                }else if(nums[mid] > nums[start] || nums[mid] == nums[start] && nums[mid]>nums[end]){
                    start = mid+1;
                }
            }

            return -1 ;
        }

}