// print X^n (stack height = n)
package Recursion;
public class calcpower{
    public static int Calcpower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x == 1){
            return 0;
        }
        int xPownm1 = Calcpower(x, n-1);
        int xPown = x*xPownm1;
        return xPown;
    }
    public static void main(String args[]){
        int x =2 , n = 5;
        int ans = Calcpower(x, n);
        System.out.println(ans);
    }
}

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

