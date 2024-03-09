package degerDonduren;

import java.util.Scanner;

public class Parametresiz {
    public static void main(String[] args) {

        System.out.println("çarpma sonucu: "+ carpma());
        System.out.println(karsilastirma());
        System.out.println(adSoyad());
    }
    public static int carpma(){
        int a =5;
        int b =8;
        return a*b;
    }

    public static boolean karsilastirma() {
        int rosie= 8;
        int ghezzal= 9;
        if (rosie<ghezzal){
            return true;
        }
        else {
            return false;
        }
    }

    public static String adSoyad() {
        Scanner sc= new Scanner(System.in);
        String name,surname;
        System.out.print("ad gir: ");
        name= sc.next();
        System.out.print("soyad: ");
        surname= sc.next();

        return name+" "+surname;

    }
}
