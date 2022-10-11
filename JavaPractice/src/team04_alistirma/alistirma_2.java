package team04_alistirma;

import java.util.Scanner;

public class alistirma_2 {
    /*
        Kullanicidan bir pozitif tam sayi isteyin,
        sayının tam kare olup olmadığını bulunuz,
        tamkare ise true değilse false yazdırınız.
        Ornek : input : 16, output: 4
         */
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");

        double tamsayi= scan.nextDouble();
        int bayrak=0;
        for (double i = 1; i <tamsayi ; i++) {
            if ((tamsayi/i)==i){
                bayrak++;
                System.out.println("true karekökü :"+i);
            }

        }
        if (bayrak==0){
            System.out.println("false");
        }



    }



}
