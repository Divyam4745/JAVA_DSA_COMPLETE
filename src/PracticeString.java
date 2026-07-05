public class PracticeString {
    //Print2
//    static int getIntLengthString(String str){
//        char[] arr= str.toCharArray();
//        int len = arr.length;
//        return len;
//    }

    //Print3
    static int getCountVowel(String str){
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //Print1 Each Character of The Stringg
//        String name1="ABCDEFGHIJKLMN";
//         char[] cr=name1.toCharArray();
//         for (char ch:cr){
//             System.out.println("value of char: "+ ch);
//         }

        //Print2 Count of String Without Length
//       String str="DivyamVishwakarma";
//        System.out.println(getIntLengthString(str));

        //Print3 count the number of Vowel in String
        String str="hgtuiehtjnbhhBDhjkgkufKYF";
        System.out.println(getCountVowel(str));







    }
}
