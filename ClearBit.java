import java.security.PublicKey;

//This Program will clear your bit from 0 to 1 at your given postion
public class ClearBit {
    public static void main(String args[]){
        int n =5;
        int position = 0;
        int BitMask = 1 << position;
        int notBitMask = ~(BitMask);

        System.out.println("This program will clear your 1 to 0 at your given position");
        System.out.println(notBitMask & n );
    }
}
