package geometrikSekiller;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hesap yapmak istediğiniz geometrik şekli seçiniz: \n"+
                "\t1. kare\n"+
                "\t2. dikdörtgen");
        int secim=scan.nextInt();

        if (secim==1){
            Kare kare=new Kare();
            kare.alan();
            kare.cevre();
        } else if (secim==2) {
            Dikdortgen dikdortgen=new Dikdortgen();
            dikdortgen.alan();
            dikdortgen.cevre();

        }else {
            System.out.println("Yanlış giriş yaptınız.");
        }


    }
}
