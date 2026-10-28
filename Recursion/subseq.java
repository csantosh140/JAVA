package Recursion;

public class subseq{
    public static void subsequences(int idx,String str,String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char curChar = str.charAt(idx);

        //to be 
        subsequences(idx, str+1, newString+curChar);
        //not to be
        subsequences(idx, str+1, newString);

    }
    public static void main(String args[]){
        String str = "abc";
        subsequences(0, str, "");
    }
}
