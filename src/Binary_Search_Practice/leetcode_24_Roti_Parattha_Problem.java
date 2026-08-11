package Binary_Search_Practice;

public class leetcode_24_Roti_Parattha_Problem {
    static boolean isValidAns(int totalParatha, int[] cooks, int totalcooks,int timeLimit){
        int parathaCount=0;
        //ek ek krke hr cook ke pass jayenge
        for (int i=0;i<cooks.length;i++){
            int currentCookRank= cooks[i];
            int timeTaken=0;
            int j=0;

            while (timeTaken<=timeLimit){
                timeTaken = j * currentCookRank;
                if (timeTaken <= timeLimit){
                    parathaCount++;
                    j++;
                }else {

                    break;
                }
            }
        }
        if (parathaCount>= totalParatha){
            return true;
        }else {
            return false;
        }
    }
    static int mintimetocookParatha(int p,int [] cook, int n){
        int maxRank=-1;
        for (int i=0;i<cook.length;i++){
            if(cook[i]> maxRank){
                maxRank=cook[i];
            }
        }

        int s=0;
        int e=maxRank*(p*(p+1)/2);
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if (isValidAns(p, cook, n, mid)) {
                //ans store
                ans=mid;
                //move to left
                e=mid-1;
            }else {
                //move to right
                s=mid+1;
            }
        }
        return ans;
    }
    static void main(String[] args) {
        // Test Case 1
        int[] cooks1 = {1, 2, 3, 4};
        int paratha1 = 10;
        int result1 = mintimetocookParatha(paratha1, cooks1, cooks1.length);
        System.out.println("Test Case 1:");
        System.out.println("Cooks: " + java.util.Arrays.toString(cooks1));
        System.out.println("Parathas needed: " + paratha1);
        System.out.println("Minimum time required: " + result1);
        System.out.println();

        // Test Case 2
        int[] cooks2 = {4, 5, 6};
        int paratha2 = 5;
        int result2 = mintimetocookParatha(paratha2, cooks2, cooks2.length);
        System.out.println("Test Case 2:");
        System.out.println("Cooks: " + java.util.Arrays.toString(cooks2));
        System.out.println("Parathas needed: " + paratha2);
        System.out.println("Minimum time required: " + result2);
        System.out.println();

        // Test Case 3
        int[] cooks3 = {3, 5};
        int paratha3 = 8;
        int result3 = mintimetocookParatha(paratha3, cooks3, cooks3.length);
        System.out.println("Test Case 3:");
        System.out.println("Cooks: " + java.util.Arrays.toString(cooks3));
        System.out.println("Parathas needed: " + paratha3);
        System.out.println("Minimum time required: " + result3);
    }
}
