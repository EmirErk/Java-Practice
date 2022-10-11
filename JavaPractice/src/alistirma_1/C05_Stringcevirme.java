package alistirma_1;

import java.util.Scanner;

public class C05_Stringcevirme {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
        //kaydedin.


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz");

        String cumle= scan.nextLine();

        String cumle2="";

        int harfSayisi=cumle.length();

        for (int i = 1; i <=harfSayisi ; i++) {

            cumle2=cumle2+cumle.charAt(harfSayisi-i);











        }


        System.out.println(cumle2);


    }






}
