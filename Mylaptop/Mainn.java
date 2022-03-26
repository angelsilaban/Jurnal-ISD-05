package Mylaptop;

import java.util.*;

public class Mainn {
    public static void main(String[] args) {
        QueueJ<String> queue = new QueueJ<>();
        Scanner in = new Scanner(System.in);
        int opsi = 0;
        while(opsi != 4){
            System.out.println("1. Masukkan Data");
            System.out.println("2. Menghapus Data");
            System.out.println("3. Print list");
            System.out.println("4. Keluar");
            opsi = in.nextInt();
            if(opsi == 1){
                System.out.println("Silahkan Masukkan Data");
                String toDo = in.next();
                queue.enqueue(toDo);
                System.out.println();
            }
            else if(opsi == 2){
                queue.dequeue();
                System.out.println("Berhasil Menghapus Tugas Pertama");
                System.out.println();
            }
            else if(opsi == 3){
                queue.printQueue();
                System.out.println();
            }
        }
    }
}
