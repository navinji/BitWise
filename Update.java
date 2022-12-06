import java.util.Scanner;

public class Update {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("update in bit ");
        int ope =sc.nextInt();
        int n =5;
        int position=1;
        int bitMask = 1 << position;

        if(ope == 1){

            System.out.println(bitMask | n);
        }
        else{
            int notBitMask = ~(bitMask);
            System.out.println(notBitMask & n);
        }
       
    }
}
