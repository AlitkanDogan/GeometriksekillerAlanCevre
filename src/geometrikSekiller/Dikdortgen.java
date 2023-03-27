package geometrikSekiller;

import java.util.Scanner;

public class Dikdortgen implements Iislemler{

    Scanner scan=new Scanner(System.in);
    @Override
    public void alan() {
        System.out.println("Dikdörtgenin 1. kenar uzunluğunu giriniz: ");
        int kenar1=scan.nextInt();
        System.out.println("Dikdörtgenin 2. kenar uzunluğunu giriniz: ");
        int kenar2=scan.nextInt();
        System.out.println("Dikdörtgenin Alanı: "+(kenar1*kenar2));
    }

    @Override
    public void cevre() {
        System.out.println("Dikdörtgenin 1. kenar uzunluğunu giriniz: ");
        int kenar1=scan.nextInt();
        System.out.println("Dikdörtgenin 2. kenar uzunluğunu giriniz: ");
        int kenar2=scan.nextInt();
        System.out.println("DikdörtgeninÇevresi "+(kenar1+kenar2)*2);
    }
}
