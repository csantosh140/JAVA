// public class recursion1 {
//     public static void printNum(int n){
//         if(n==6){
//             return;
//         }
//         System.out.println(n);
//         printNum(n+1);
//     }
//     public static void main(String[] args){
//         int n=1;
//         printNum(n);    
//         }    
// }


// public class recursion1 {
//     public static void printSum(int i,int n,int sum){
//         if(i==n){
//             sum+=i;
//             System.out.print(sum);
//             return;
//         }
//         sum += i;
//         printSum(i+1,n,sum);
//         System.out.println();
//       }
//     public static void main(String[] args){
//         printSum(1, 5, 0);
       
//         }    
//     }


//Print Factorial Number 
// public class recursion1{
//     public static int calcfactorial(int n){
//         if(n == 1 || n == 0){
//             return 1;
//         }
//         int fact_nm1 = calcfactorial(n-1);
//         int fact_n = n * fact_nm1;
//         return fact_n;

//     }
//     public static void main(String args[]){
//         int n = 5;
//         int ans = calcfactorial(n);
//         System.out.println(ans);
//     }
// }


// public class recursion1{
//     public static int fact(int n){
//         if(n == 1 || n == 0){
//             return 1;
//         }
//         int fact_nm1 = fact(n-1);
//         int fact_n = n * fact_nm1;
//         return fact_n;
//      }
//      public static void main(String args[]){
//         int n = 5;
//         int ans = fact(n);
//         System.out.print(ans);
//      }
//     }


// public class recursion1{
//     public static int fact(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//         int fact_nm1 = fact(n-1);
//         int fact_n = n*fact_nm1;
//         return fact_n;
//     }
//     public static void main(String args[]){
//         int n = 5;
//         int ans = fact(n);
//         System.out.print(ans);
//     } 
//}


// write java code for print fibonacci sequence until nth number 
// public class recursion1{
//     public static void printFib(int a,int b, int n){
//         if(n == 0){
//             return;
//         }
//         int c = a+b;
//         System.out.print(c);
//         printFib(b , c, n-1);
//      }
//     public static void main(String args[]){
//         int a=0,b=1;
//         System.out.print(a);
//         System.out.print(b);
//         int n=7;
//         printFib(a,b,n-2);

//     } 
// }


// public class recursion1{
//     public static void printFib(int a, int b, int n){
//         if(n == 0){
//             return;
//         }
//         int c =a+b;
//         System.out.println(c);
//         printFib(b,c,n-1);
//     }
//     public static void main(String args[]){
//         int a = 0,b =1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=7;
//         printFib(a,b,n-2);
//     }
// }


// print X^n (stack height = n)
// public class recursion1{
//     public static int Calcpower(int x,int n){
//         if(n==0){
//             return 1;
//         }
//         if(x == 1){
//             return 0;
//         }
//         int xPownm1 = Calcpower(x, n-1);
//         int xPown = x*xPownm1;
//         return xPown;
//     }
//     public static void main(String args[]){
//         int x =2 , n = 5;
//         int ans = Calcpower(x, n);
//         System.out.println(ans);
//     }
// }

// public class recurion1{
//     public static int Calcpower(int x , int n){
//         if(n == 0){
//             return 1;
//         }
//         if(x == 1){
//             return 0;
//         }
//         int xPownm1 = Calcpower(x , n-1);
//         int xPown = x*xPownm1; 
//         return xPown;
//     }
//     public static void main(String args[]){
//         int x=2,n=5;
//         int ans =Calcpower(x,n);
//         System.out.println(ans);
//     }
// }


// TOWER OF HANOI
// public class recursion1{
//     public static void towerofHamoi(int n,String src,String Helper,String dest){
//         if(n==1){
//             System.out.println("transfer desk "+n+" From "+ src+" To "+dest);
//             return;
//         }
//         towerofHamoi(n-1, src, dest, Helper);
//         System.out.println("transfer desk "+n+" From "+ src+" To "+dest);
//         towerofHamoi(n-1, Helper,src,dest);

    
//     }
//     public static void main(String args[]){
//         int n=3;
//         towerofHamoi(n,"S","H","D");
//         System.out.println("Total number of moves : " + (2*n-1));

        
//     }
// }


// public class recursion1{
//     public static void TowerOfHanoi(int n,String src,String helper,String dest){
//         if(n==1){
//             System.out.println("Trnsfered desk "+n+" from "+ src +" To "+dest);
//             return;
//         }
//         TowerOfHanoi(n-1, src, dest, helper);
//         System.out.println("Trnsfered desk "+n+" from "+ src +" To "+dest);
//         TowerOfHanoi(n-1, helper, src,dest);
//     }
//     public static void main(String args[]){
//         int n = 5;
//         TowerOfHanoi(n,"S","H","D");
//         System.out.println("Total Number of Moves: "+(2*n-1));
//     }
// }

// public class recursion1{
//     public static void ToH(int n,String src,String helper,String dest){
//         if(n == 1){
//             System.out.println("Transfered Disk "+ n+" From "+src+" To "+dest);
//             return;
//         }
//         ToH(n-1, src, helper, dest);
//         System.out.println("Transfered desk "+n+" From "+src+" To "+dest);
//         ToH(n-1, helper,src, dest);
//     }
//     public static void main(String args[]){
//         int n =3;
//         ToH(n,"S","H","D");
//         System.out.println("Total Moves :" +(2*n-1));
//     }
// }

// public class recursion1{
//     public static void ToH(int n , String src,String helper,String dest){
//         if(n == 1){
//             System.out.println("Transfered Disk "+n+" From "+src+" To "+dest);
//             return;
//         }
//         ToH(n-1,src,dest,helper);
//         System.out.println("Transfered Disk "+n+" From "+src+" To "+dest);
//         ToH(n-1,helper,src,dest);

//     }
//     public static void main(String args[]){
//         int n = 5;
//         ToH(n,"S","H","D");
//         System.out.println("Total Moves :"+(2*n-1));
//     }
// }

// public class recursion1{
//     public static void ToH(int n,String src, String helper,String Dest){
//         if(n==1){
//             System.out.println("transfered Disk"+n+"From"+src+"to"+Dest);
//             return;
//         }
//         ToH(n-1,src,Dest,helper);
//         System.out.println("transfered Disk"+n+"From"+src+"to"+Dest);
//         ToH(n-1,helper,src,Dest );
//     }
//     public static void main(String args[]){
//         int n = 5;
//         ToH(n,"S","H","D");
//         System.out.println("Total Moves :"+(2*n-1));
//     } 
// }




// Print reverse as a given string

// public class recursion1{
//     public static void printreverse(String str,int index ){
//         if(index == 0){
//         System.out.println(str.charAt(index));
//         return;
//     }
//     System.out.print(str.charAt(index));
//     printreverse(str, index-1);
// }
//     public static void main(String args[]){
//         String str = "abcd";
//         printreverse(str,str.length()-1);

//     }
// }


// Find the first and last occurance of the string
// public class recursion1{
//     public static int first =-1;
//     public static int last = -1;

//     public static void FindOccurance(String str,int idx, char element){
//         if(idx == str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(currChar == element){
//             if(first == -1){
//                 first =idx;
//             }else{
//                 last = idx;
//             }
//         }
//         FindOccurance(str, idx+1, element);
//     }
//     public static void main(String args[]){
//         String str = "abaacdaefaah";
//         FindOccurance(str, 0, 'b');
//     }
// }


// public class recursion1{
//     public static boolean isSorted(int arr[] , int idx){
//         if(idx == arr.length-1 ){
//             return true;
//         }
//     if(arr[idx] < arr[idx+1]){
//         return isSorted(arr,idx+1);
//     }else{
//         return false;
//     }
// }
// public static void main(String args[]){
//     int arr[] = {1,2,3,4};
//     System.out.println(isSorted(arr,0)); 
// }
// }

// public class recursion1{
//     public static boolean isSorted(int arr[],int idx){
//         if(idx==arr.length-1){
//             return true;
//         }
//         if(arr[idx]<arr[idx+1]){
//             return false;
//         }else{
//             return isSorted(arr,idx+1);
//         }
//     }
//     public static void main(String args[]){
//         int arr[] = {9,8,4,5,6};
//         System.out.println(isSorted(arr,0));
//     }
// }


//Move All X to the last
// public class recursion1{
//     public static void moveAll(String str , int idx,int count, String newString){
//         if(idx == str.length()){
//             for(int i = 0 ; i<count;i++){
//                 newString+="x";
//         }
//         System.out.println(newString);
//         return;
//     }
//     char currChar = str.charAt(idx);
//     if(currChar == 'x'){
//         count++;
//         moveAll(str, idx+1, count, newString);
//     }
//     else{
//         newString+=currChar;
//         moveAll(str, idx+1, count, newString);
//         }
//     }
//     public static void main(String args[]){
//         String str ="axbxxc";
//         moveAll(str, 0, 0,"");

//     }
// }

// public class recursion1{
//     public static void moveAllx(String str , int idx,int count , String newString){
//         if(idx ==str.length()){
//             for(int i=0;i<count;i++){
//                 newString+="x";
//             }
//             System.out.println(newString);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         if(curChar == 'x'){
//             count++;
//             moveAllx(str, idx+1, count, newString);
//         }else{
//             newString+=curChar;
//             moveAllx(str,idx+1,count,newString);
//         }
//     }
//     public static void main(String args[]){
//         String str = "abxcxx";
//         moveAllx(str, 0, 0, "");

//     }
// }

//Remove Duplicate From the String

// public class recursion1{
//     public static boolean[] map = new boolean[26];

//     public static void removeDuplicates(String str, int idx,String newstr){
//         if(idx==str.length()){
//             System.out.println(newstr);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         if(map[curChar-'a']){
//             removeDuplicates(str, idx+1,newstr);
//         }else{
//             newstr+=curChar;
//             map[curChar-'a'] = true;
//             removeDuplicates(str, idx+1, newstr);
//         }

//     }
//     public static void main(String args[]){
//         String str = "abbccda";
//         removeDuplicates(str, 0,"");
//     }


// }

// public class recursion1{
//     public static boolean[] map = new boolean[26];
//     public static void rm(String str,int idx, String newString){
//         if(idx == str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char curChar = str.charAt(idx);
//         if(map[curChar-'a']){
//             rm(str, idx+1, newString);

//         }else{
//             newString+=curChar;
//             map[curChar-'a']=true;
//             rm(str, idx+1, newString);
//         }
//     }
//     public static void main(String args[]){
//         String str = "abbccda";
//         rm(str, 0, "");
//     }
// }

// public class subseq{
//     public static void subsequences(int idx,String str,String newString){
//         if(idx == str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char curChar = str.charAt(idx);

//         //to be 
//         subsequences(idx, str+1, newString+curChar);
//         //not to be
//         subsequences(idx, str+1, newString);

//     }
//     public static void main(String args[]){
//         String str = "abc";
//         subsequences(0, str, "");
//     }
// }

// public class recursion1{
//     public static void subsequences(int idx,String str,String newString){
//         if(idx == str.length()){
//           System.out.println(newString);
//           return;
//         }
//         char curChar = str.charAt(idx);
//         //to be 
//         subsequences(idx + 1, str, newString + curChar);
//         //not to be
//         subsequences(idx + 1, str, newString);
//     }
//     public static void main(String args[]){
//         String str = "abc";
//         subsequences(0, str, "");
//     }
// }


// public class recursion1{
//     public static boolean[] map = new boolean[26];
//     public static boolean duplicates(String str,int idx,String newString){
//         if(idx == str.length()){
//             System.out.println(newString);
//             return true;
//         }
//         char curChar = str.charAt(idx);
//         if(map[curChar -'a']){
//             return duplicates(str,idx+1,newString);
//         }else{
//         map[curChar - 'a'] = true;
//         return duplicates(str,idx+1,newString + curChar);
//     }
// }
//     public static void main(String args[]){
//         String str = "abbccdhutrffhhggddesa";
//         duplicates(str, 0,"");
//     }
// }



