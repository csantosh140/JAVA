package Recursion;

// TOWER OF HANOI
public class towerofhanoi{
    public static void towerofHamoi(int n,String src,String Helper,String dest){
        if(n==1){
            System.out.println("transfer desk "+n+" From "+ src+" To "+dest);
            return;
        }
        towerofHamoi(n-1, src, dest, Helper);
        System.out.println("transfer desk "+n+" From "+ src+" To "+dest);
        towerofHamoi(n-1, Helper,src,dest);

    
    }
    public static void main(String args[]){
        int n=3;
        towerofHamoi(n,"S","H","D");
        System.out.println("Total number of moves : " + (2*n-1));

        
    }
}


// public class towerofhanoi{
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

// public class recusrion4{
//     public static void ToH(int n,String src,String Helper,String dest){
//         if(n==1){
//             System.out.println("transfered disk "+n+"From"+src+"to"+dest);
//             return;
//         }ToH(n-1,src,dest,Helper);
//         System.out.println("transfered disk "+n+"from "+src+"to"+dest);
//         ToH(n-1, Helper, src, dest);
//     }
//     public static void main(String args[]){
//         int n =6;
//         ToH(n,"S","H","D");
//         System.out.println("Total Moves :"+(2*n-1));
//     } 
// }