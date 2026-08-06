class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int start=0;
        int current=0;
        int prev =nums[0];
        for(int i=0;i<n;i++){
            int nextIndex=(current+k)%n;
            int temp=nums[nextIndex];
            nums[nextIndex]=prev;
            prev=temp;
            current = nextIndex;
            if(current==start){
                start++;
                current=start;
                if(start<n){
                    prev=nums[start];
                }
            }
        }
        
    }
}