package alistirma_1;

import java.util.Scanner;

public class C04_Stringcevirme {
    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");

        String cumle= scan.nextLine();

        int harfSayisi=cumle.length();

        for (int i = 1; i <=harfSayisi ; i++) {

            System.out.print(cumle.charAt(harfSayisi-i));








        }





    }
}
