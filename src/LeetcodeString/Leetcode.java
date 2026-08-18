package LeetcodeString;

public class Leetcode {
     static String removeoccurence(String s,String part){
         //jb tk part exist krta hai yes me
         while (s.contains(part)){
             int index = s.indexOf(part);
             // create a new string ehich contains new substring
             s = s.substring(0,index)  +  s.substring(index+ part.length());
         }
         return s;
     }
    static void main() {
         String s= "abababcaby";
         String part= "ab";

         String result= removeoccurence(s,part);
        System.out.println(result);

    }
}
