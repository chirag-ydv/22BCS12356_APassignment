class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums); // O(nlogn)
        // int n = nums.length;
        // int zcount = 0;
        // int ocount = 0;
        // int scount = 0;
        // for(int i = 0 ;i<n;i++){
        //     if(nums[i]==0){
        //         zcount++;
        //     }
        //     else if(nums[i]==1){
        //         ocount++;
        //     }
        //     else if(nums[i]==2){
        //         scount++;
        //     }

        // }


        // 
        int start = 0;
        int end = nums.length-1;
        int i =0;
        while(i<=end){
            if(nums[i]==0){
                int temp = nums[start];
                nums[start]= nums[i];
                nums[i] = temp;
                start++;
                i++;
            }
            else if(nums[i]==2){
                int temp = nums[end];
                nums[end]= nums[i];
                nums[i] = temp;
                end--;
            }
            else {
                i++;
            }
            
        }

    }
}