package team04_alistirma;

import java.util.Scanner;

public class alistirma_3 {

    /*
    Kullanicidan satin aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri karti
    olup olmadigini sorun.
    Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim
    yapin, Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin"
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen urun adedi girin");

        int urunadedi= scan.nextInt();

        System.out.println("Lutfen musteri kartiniz varsa 1 e , yoksa 2 yi tuslayin");

        int kartVarmi= scan.nextInt();

        double listefiyati=50;

        if (kartVarmi==1){
            if (urunadedi>=10){
                System.out.println("%20 indirim:"+urunadedi * listefiyati * 0.8);
            }
            else if (urunadedi>0){
                System.out.println("%15 indirim:"+urunadedi * listefiyati * 0.85);
            }

        }else if (kartVarmi==2){
            if (urunadedi>=10){
                System.out.println("15 indirim:"+urunadedi * listefiyati * 0.85);
            }
            else if (urunadedi>0){
                System.out.println("%10 indirim:"+urunadedi * listefiyati * 0.90);
            }

        }









    }












}
