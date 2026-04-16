public class Shifter{
    static void reverse(int[] nums,int start,int stop){
        while(start<=stop){
            int tmp=nums[start];
            nums[start]=nums[stop];
            nums[stop]=tmp;
            start++;
            stop--;
        }
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7};
        int k=2;
        int len=nums.length-1;
        reverse(nums,0,len);
        
        /*reverse(nums,0,k);                // Left Shifter
        reverse(nums,k+1,len);*/
        
        /*reverse(nums,0,len-k-1);          // Right Shifter
        reverse(nums,len-k,len); */
        
        for(int x:nums)
            System.out.print(x+" ");
        
    }
}