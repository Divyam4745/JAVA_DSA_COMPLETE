package Recursion;

public class Leetccode_10 {

    static boolean solve(int [] nums,int index){
        //base case
        //reached destination
        if (index==nums.length-1){
            return  true;
        }
        //destination se bahar /aage nikal gya
        if (index>=nums.length){
            return false;
        }
        //stuck hone wali situation
        if (nums[index]==0){
            return false;
        }
        int jumpValue=nums[index];
        boolean overallAns=false;
        for (int jump=1;jump<=jumpValue;jump++){
            boolean  recAns=solve(nums,index+jump);
            overallAns=overallAns || recAns;
        }
        return overallAns;
    }
    public  boolean canJump(int [] nums){
        int  index=0;
        boolean ans= solve(nums,index);
        return ans;
    }
}
