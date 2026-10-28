package Recursion;

// Remove Duplicate From the String

public class remduplicate{
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char curChar = str.charAt(idx);
        if(map[curChar-'a']){
            removeDuplicates(str, idx+1,newstr);
        }else{
            newstr+=curChar;
            map[curChar-'a'] = true;
            removeDuplicates(str, idx+1, newstr);
        }

    }
    public static void main(String args[]){
        String str = "abbccda";
        removeDuplicates(str, 0,"");
    }


}