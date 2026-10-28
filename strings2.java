// import java.util.*;
// public class strings2 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         StringBuilder sb = new StringBuilder("Tony");
//         System.out.println("name : "+sb);

//         System.out.println("Your Character is: "+sb.charAt(0));

//         sb.setCharAt(0, 'P');
//         System.out.println(sb +" Replaced Char is :"+sb.charAt(0) );

//         sb.insert(0,'S');
//         System.out.println(sb);

//         sb.deleteCharAt(1);
//         System.out.println(sb);

//         sb.deleteCharAt(0);
//         System.out.println(sb);

//         sb.insert(0, 'H');
//         System.out.println(sb);

//         sb.insert(2,'R');
//         System.out.println(sb);

//         sb.delete(2, 3);
//         System.out.println(sb);

//         sb.delete(0,3);
//         System.out.println(sb);

//         // sb.insert((0,1,2,3,4),('T','o','x','i','c'));
//         sb.insert(0,'T');
//         sb.insert(1,'o');
//         sb.insert(2,'x');
//         sb.insert(3,'i');
//         sb.insert(4,'c');
//         sb.delete(5,'y');
//         sb.append("Themovie");
//         sb.insert(0,'#');
//         // System.out.print(sb);
//         // System.out.println(sb.length());
//         // sb.reverse();
//         // System.out.print(sb.length());

//         for(int i=0;i<sb.length()/2;i++){
//             int front =i;
//             int back = sb.length()-1-i;
//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(back);

//             sb.setCharAt(front,backChar);
//             sb.setCharAt(back,frontChar);

//         }
//         System.out.println(sb);

//     }

// }
