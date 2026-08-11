package Binary_Search_Practice;

public class leetcode25_EKO_SPOJ {
    static boolean isValidAns(int arr[], int m, int maxHeight) {
        int woodcollected = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxHeight) {
                int currenttreewoodcollectes = arr[i] - maxHeight;
                woodcollected += currenttreewoodcollectes;
            }
        }
        if (woodcollected >= m) {
            return true;
        } else {
            return false;
        }
    }

    static int maxSawHeight(int arr[], int m) {
        int n = arr.length;
        int s = 0;
        int maxi = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        int ans = -1;
        int e = maxi;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAns(arr, m, mid)) {
                //ans store
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }


    static void main(String[] args) {
        int arr[] = {20, 15, 10, 17};
        int m = 7;
        int value = maxSawHeight(arr,7);
        System.out.println(value);
    }
}