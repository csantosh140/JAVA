// // // // import java.util.*;
// // // // public class bubblesort{
// // // //     public static void printArray(int arr[]){
// // // //         for(int i=0; i<arr.length;i++){
// // // //             System.out.print(arr[i]+" ");
// // // //         }
// // // //         System.out.println();
// // // //     }
// // // //     public static void main(String[] args){
// // // //         int arr[] = {7,8,3,1,2};
        
// // // //         for(int i = 0;i<arr.length-1;i++){
// // // //             for(int j=0; j<arr.length-i-1;j++){
// // // //                 if(arr[j] > arr[j+1]){
// // // //                     int temp = arr[j];
// // // //                     arr[j] = arr[j+1];
// // // //                     arr[j+1] = temp;
// // // //                 }
// // // //             }

// // // //         }
// // // //         printArray(arr);
// // // // }
// // // // }


// // // // public class bubblesort{
// // // //     public static void printArray(int arr[]){
// // // //         for(int i=0;i<arr.length;i++){
// // // //             System.out.print(arr[i]+" ");
// // // //         }
// // // //         System.out.println();
// // // //     }
// // // //     public static void main(String[] args){
// // // //         int arr[]= {7,9,2,4,1};

// // // //         for(int i=0;i<arr.length-1;i++){
// // // //             for(int j=0; j<arr.length-i-1;j++){
// // // //                 if(arr[j]>arr[j+1]){
// // // //                     int temp = arr[j];
// // // //                     arr[j] = arr[j+1];
// // // //                     arr[j+1] = temp;
// // // //                 }
// // // //         }
// // // //     }
// // // //     printArray(arr);
// // // // }
// // // // }



// // // // import java.util.*;
// // // // public class bubblesort{
// // // //     public static void printArray(int arr[]){
// // // //         for(int i=0; i<arr.length;i++){
// // // //             System.out.print(arr[i]+" ");
// // // //         }
// // // //         System.out.println();
// // // //     }
// // // //     public static void main(String[] args){
// // // //         int arr[] = {7,4,9,2,9};

// // // //         for(int i=0; i<arr.length-1;i++){
// // // //             for(int j=0;j<arr.length-1-i;j++){
// // // //                 if(arr[j]>arr[j+1]){
// // // //                     int temp = arr[j];
// // // //                     arr[j] = arr[j+1];
// // // //                     arr[j+1] = temp;
// // // //                 }
// // // //             }
// // // //         }
// // // //         printArray(arr);
// // // //     }
// // // // }


// // // public class bubblesort{
// // //     public static void printArray(int arr[]){
// // //         for(int i=0;i<arr.length;i++){
// // //             System.out.print(arr[i]+" ");
// // //         }
// // //         System.out.println();
// // //     }
// // //     public static void main(String[] args){
// // //         int arr[] = {2,8,9,1,4};

// // //         for(int i=0;i<arr.length-1;i++){
// // //             for(int j=0;j<arr.length-i-1;j++){
// // //                 if(arr[j]>arr[j+1]){
// // //                     int temp = arr[j];
// // //                     arr[j] = arr[j+1];
// // //                     arr[j+1] = temp;
// // //                 }
// // //             }
// // //         }
// // //         printArray(arr);
// // //     }
// // // }

// import java.util.*;
// public class bubblesort{
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();

//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter ARR :");
//         // int arr[] = sc.next(System.in);
//         int arr[] = {3,2,5,1,6};

//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] =temp;

//                 }
//             }
//         }
//         printArr(arr);
//     }
// }


// ///////////////////////////////////////////   SELECTION SORT   /////////////////////////////////////////////////
// public class sorting{
//     public static void seletionsort(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//         public static void main(String[] args){
//             int arr[] = {7,9,0,3,2,1};
            
//             for(int i=0;i<arr.length-1;i++){
//                 int smallest = i;
//                 for(int j=i+1;j<arr.length;j++){
//                     if(arr[smallest]>arr[j]){
//                         smallest = j;
//                     }
//                 }
//                 int temp = arr[smallest];
//                 arr[smallest] =arr[i];
//                 arr[i] = temp;
//             }
//             seletionsort(arr);

//             }


//         }


// public class sorting{
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int arr[] ={3,9,2,1,8};
        
//         for(int i=0;i<arr.length;i++){
//             int smallest = i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[smallest]>arr[j]){
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;

//         }
//         printArr(arr);
//     }
// }

// /////////////////////////////////////////// INSERTION SORT ///////////////////////////////////////////////////////////


// public class sorting{
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int arr[] ={3,9,2,1,8};
        
//         for(int i=1;i<arr.length;i++){
//             int current = arr[i];
//             int j = i-1;
//             while(j>=0 && current < arr[j]){
//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1] = current;
//         }
//         printArr(arr);
//     }
// }

// //////////////////////////////////////////////////
// / 
// public class sorting{
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     System.out.println();
//     }
//     public static void main(String[] args){
//         int arr[] = {2,8,5,1,9,3};

//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;

//                 }
//             }
//         }
//         printArr(arr);

// //     }
// // }

// // //////////////////////BUBBLE SORT////////////////////////////
// // public class sorting{
// //     public static void printArr(int arr[]){
// //         for(int i=0;i<arr.length;i++){
// //              System.out.print(arr[i]+" ");
// //         }
// //     System.out.println();
//     }
//     public static void main(String[] args){
//         int arr[] = {2,9,5,1,0,8};

//         for(int i=0; i<arr.length-1; i++){
//             for(int j=0; j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] =temp;
//                 }
//             }
//         }
//         printArr(arr);
//     }
// }


// public class sorting{
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int arr[] = { 0,9,8,7,6,5,4,3,2,1};

//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         printArr(arr);
//     }
// }

// import java.util.*;
// public class sorting{
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int arr[] = {3,5,2,9,7};
        
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int Temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = Temp;
//                 }
//             }
//         }
//         printArr(arr);
//     }
// }


// public class sorting{
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int arr[] ={0,9,8,7,6,5,4,3,2,1};

//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int Temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = Temp;
//                 }
//             }
//         }
//         printArr(arr);
//     }
// }


// public class sorting{
//     public static void seletionsort(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//         public static void main(String[] args){
//             int arr[] = {7,9,0,3,2,1};
            
//             for(int i=0;i<arr.length-1;i++){
//                 int smallest = i;
//                 for(int j=i+1;j<arr.length;j++){
//                     if(arr[smallest]>arr[j]){
//                         smallest = j;
//                     }
//                 }
//                 int temp = arr[smallest];
//                 arr[smallest] =arr[i];
//                 arr[i] = temp;
//             }
//             seletionsort(arr);
//         }
// }

// public class sorting{
//     public static void printArr(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[]args){
//         int arr[]={2,8,4,3,2,9};
//         for(int i=0;i<arr.length;i++){
//             // for(int j=0;j<arr.length;j++){
//                 int current = arr[i];
//                 int j = i-1;
//                 while(j>=0 && current <arr[j]){
//                     arr[j+1]=arr[j];
//                     j--;
//                 }
//                 arr[j+1]=current;
//         }
//         printArr(arr);
//     }
// }

// for(int i=1;i<arr.length;i++){
//             int current = arr[i];
//             int j = i-1;
//             while(j>=0 && current < arr[j]){
//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1] = current;
//         }
//         printArr(arr);
//     }
// }