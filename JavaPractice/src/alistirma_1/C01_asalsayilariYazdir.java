package alistirma_1;

public class C01_asalsayilariYazdir {
    public static void main(String[] args) {



        boolean flag=true;

        for (int i =2; i <100 ; i++) {

            for (int j =2; j <i ; j++) {

                if (i%j==0){
                    flag=false;
                break;
                }

            }
        if (flag){
            System.out.println(i);

        }
        flag=true;




        }
        









    }
}
