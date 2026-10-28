import java.util.Scanner;

public class binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos =2;
        int bitMask =1<<pos;

        if((bitMask & n) == 0){
            System.out.println("bit was one");
        }
        else{
            System.out.println("Bit Was Zero");
        }

        

    }

}