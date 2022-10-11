package team04_alistirma;

import java.util.Scanner;

public class alistirma_1 {
    //
    //   Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
    //   dort islemden biri ile isleme koyup sonucunu yazdiriniz

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 2 sayi giriniz");

        
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println("toplama için 1, çıkarma için 2, bolme için 3, carpma icin 4 giriniz");
        int islem= scan.nextInt();


        if (islem==1){
            System.out.println(sayi1+sayi2);
        } else if (islem==2) {
            System.out.println(sayi1-sayi2);
        } else if (islem==3) {
            System.out.println(sayi1 / sayi2);
        } else if (islem==4) {
            System.out.println(sayi2 * sayi1);
        }else{
            System.out.println("Yanlis islem girisi");
        }





    }
    









}
