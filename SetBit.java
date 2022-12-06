//This Program will set the bit 1 in given position i.e SET BIT
public class SetBit {
    public static void main(String args[]){
        System.out.println("This Program will change Your bit to 1 at given position ");
        int n = 5; //0101
        int position =  3;
        int BitMask = 1 << position;
        
        System.out.println(BitMask | n);
    }
}
