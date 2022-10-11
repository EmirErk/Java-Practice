package alistirma_1;

import java.util.Scanner;

public class C02_asalsayiyazdir {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");

        int sayi = scan.nextInt();

        boolean flag=true;

        for (int i = 2; i <sayi ; i++) {

            if (sayi%i==0){
                flag=false;
                break;
            }


        }
        if (flag){
            System.out.println("Asal");
        }else{
            System.out.println("Asal degil");
        }




    }



}
