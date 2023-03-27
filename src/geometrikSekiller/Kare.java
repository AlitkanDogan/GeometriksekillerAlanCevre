package geometrikSekiller;

import java.util.Scanner;

public class Kare implements Iislemler{

    Scanner scan=new Scanner(System.in);
    @Override
    public void alan() {
        System.out.println("Karenin kenar uzunluğunu giriniz: ");
        int kenar=scan.nextInt();
        System.out.println("karenin Alanı: "+(kenar*kenar));
    }

    @Override
    public void cevre() {
        System.out.println("Karenin kenar uzunluğunu giriniz: ");
        int kenar=scan.nextInt();
        System.out.println("karenin Çevresi: "+(kenar*4));
    }
}
