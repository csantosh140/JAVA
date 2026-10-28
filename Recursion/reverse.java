package Recursion;

//  Print reverse as a given string

public class reverse{
    public static void printreverse(String str,int index ){
        if(index == 0){
        System.out.println(str.charAt(index));
        return;
    }
    System.out.print(str.charAt(index));
    printreverse(str, index-1);
}
    public static void main(String args[]){
        String str = "abcd";
        printreverse(str,str.length()-1);

    }
}