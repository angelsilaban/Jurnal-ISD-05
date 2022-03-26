package Mylaptop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner laptop = new Scanner(System.in);
        String total;

        if (laptop.equals("")) {
            System.out.println("Masukan kembali Infix !");
        } else {
            Penghitungan theTrans = new Penghitungan(laptop.next());
            total = theTrans.doTrans();
            System.out.println(total);
        }
    }
}
