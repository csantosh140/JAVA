package BackTracking;

// public class backtracking {
//     public static void permutations(String str,String perm,int idx){
//         if(str.length() == 0){
//             System.out.println(perm);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             char currChar = str.charAt(i);
//             String newStr = str.substring(0,i)+str.substring(i+1);
//             permutations(newStr, perm+currChar, idx+1);
//         }

//     }
//       public static void main(String[] args ){
//         String str = "ABC";
//         permutations(str, "", 0);
//     }
    
// }


// public class backtracking{
//     public static void permutation(String str, String perm,int idx){
//         if(str.length()==0){
//             System.out.println(perm);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             char curChar =str.charAt(i);
//             String newString = str.substring(0,i)+str.substring(i+1);
//             permutation(newString, perm+curChar, idx+1);
//         }
//     }
//     public static void main(String[] args){
//         String str = "ABC";
//         permutation(str, "", 0);
//     }
// }


