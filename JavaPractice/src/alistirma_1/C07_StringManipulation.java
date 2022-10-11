package alistirma_1;

import java.util.Scanner;

public class C07_StringManipulation {
    public static void main(String[] args) {

        //Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        //:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        //yazdirin

        String cumle="Emirhan";

        int uzunluk=cumle.length();

        String gulucuk=":)";
        String aglama=":(";


        if (uzunluk%2==0){

            System.out.println(cumle.substring(0,(uzunluk/2))+gulucuk+cumle.substring(uzunluk/2));
        }else{
            System.out.println(cumle.substring(0,(uzunluk/2))+aglama+cumle.substring((uzunluk/2)+1));
        }






    }


}
