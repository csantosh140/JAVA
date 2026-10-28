package arrays;
//ascending order
// public class level2 {
//     public static void main(String[] args){
//         int[] arr = {2,1,6,3,9,5};
//         for(int i=0;i<arr.length;i++){
//             System.out.print(i);        }

//     }
    
// }

// /Descending order
// public class level2 {
//     public static void main(String[] args){
//         int[] arr = {2,1,6,3,9,5};
//         for(int i=arr.length-1;i>=0;i--){
//             System.out.print(i);        }

//     }
    
// }

// public class level2 {
//     public static void main(String[] args){
//         int[] arr = {10,20,30,40,40,20,10};
//         for(int i=0;i<arr.length;i++){
//             boolean duplicate =false;;
//             for(int j=0;j<i;j++){
//                 if(arr[i]==arr[j]){
//                     duplicate =true;
//                     break;
                
//             }
//         }
//         if(!duplicate){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }
// }


// public class level2{
//     public static void main(String[] args){
//         int[] arr ={10,20,10,30,20,10};
//         boolean[] visited =new boolean[arr.length];
//         for(int i=0;i<arr.length;i++){
//             if (visited[i]){
//             continue;
//             }
//             int count =1;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                     visited[j]=true;
//                 }
//             }
//             System.out.println(arr[i]+" occurs "+count+" times ");
//         }
//     }
// }




// public class level2{
//     public static void main(String[] args){
//         int[] arr={10,20,10,30,20,10};
//         boolean[] visited = new boolean[arr.length];
//         for(int i=0;i<arr.length;i++){
//             if(visited[i]){
//                 continue;
//             }
//             int count=1;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                     visited[j]=true;
//                 }
//             }
//             System.out.println(arr[i]+" occurs "+count+" times");
//         }

//     }
// }

////////////merge two elements in the array////////////////
// public class level2{
//     public static void main(String[] args){
//         int[] a = {1,2,3};
//         int[] b = {4,5,6};

//         int[] merged =new int[a.length+b.length];
//         for(int i=0;i<a.length;i++){
//             merged[i]=a[i];
//         }
//         for(int i=0;i<b.length;i++){
//             merged[a.length+i]=b[i];
//         }
//         for(int num:merged){
//             System.out.print(num + " ");
//         }
//     }
// }


// public class level2{
//     public static void main(String[] args){
//         int[] a = {1,2,3};
//         int[] b = {4,5,6};
//         int[] merged = new int[a.length+b.length];
        
//         for(int i=0;i<a.length;i++){
//             merged[i]=a[i];
//         }
//         for(int i=0;i<b.length;i++){
//             merged[a.length+i]=b[i];
//         }
//         for(int num:merged){
//             System.out.print(num + " ");
//         }
//     }}
