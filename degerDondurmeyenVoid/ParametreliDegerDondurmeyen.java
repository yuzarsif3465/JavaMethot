package degerDondurmeyenVoid;

public class ParametreliDegerDondurmeyen {

    public static void main(String[] args) {
        cikar(9,7);
        bolme(7,3);
    }

    public static void cikar(int a, int b ) {
        int cikarma = a-b;
        System.out.println(cikarma);
    }

    public static void bolme(int c, int d) {
        float bolme= c/d;
        System.out.println("bolme sonucu: "+ bolme);
    }
}
