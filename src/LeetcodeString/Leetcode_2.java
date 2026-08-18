package LeetcodeString;

public class Leetcode_2 {
    static char getmaxFreqChar(String s) {
        int freq[] = new int[26];
        for (int i=0;i<s.length();i++){
            char currchar= s.charAt(i);
            freq[currchar-'a']++;
        }
        int maxfreq=-1;
        char ans = 0;
        for (int i=0;i<26;i++){
            if (freq[i] > maxfreq){
                maxfreq=freq[i];
                ans=(char) (i+ 'a');
            }
        }
        return ans;
    }
    static void main() {
//        String s= "output";
//        System.out.println(getmaxFreqChar(s));
        String s="testsample";
        System.out.println(getmaxFreqChar(s));

    }
}
