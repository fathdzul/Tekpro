import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
 
public class PenjumlahanParalel {
 
    // AtomicLong dipakai untuk total akhir karena beberapa thread
    // akan mengaksesnya secara bersamaan -- AtomicLong menjamin
    // operasi addAndGet() bersifat atomik (tidak bisa diselingi thread lain)
    private static AtomicLong totalAkhir = new AtomicLong(0);
 
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
 
        // Menerima input dari user
        System.out.print("Masukkan jumlah thread: ");
        int jumlahThread = scanner.nextInt();
 
        System.out.print("Masukkan angka akhir: ");
        long angkaAkhir = scanner.nextLong();
        scanner.close();
 
        // Bagi rentang angka secara merata ke setiap thread (Divide and Conquer)
        long chunkSize = angkaAkhir / jumlahThread;
 
        // Array untuk menyimpan semua thread
        Thread[] threads = new Thread[jumlahThread];
 
        for (int i = 0; i < jumlahThread; i++) {
            final int threadIdx = i; // harus final agar bisa dipakai di dalam lambda
 
            // Hitung rentang awal dan akhir untuk tiap thread
            final long start = threadIdx * chunkSize + 1;
            // Thread terakhir mengambil sisa angka (kalau angkaAkhir tidak habis dibagi)
            final long end = (threadIdx == jumlahThread - 1) ? angkaAkhir : (threadIdx + 1) * chunkSize;
 
            threads[i] = new Thread(() -> {
                long partialSum = 0; // Hasil parsial milik thread ini saja
 
                // Tampilkan tugas yang dikerjakan thread ini
                System.out.println("Thread-" + (threadIdx + 1)
                    + " mengerjakan: " + start + " - " + end);
 
                // Lakukan penjumlahan untuk rentang yang sudah ditentukan
                for (long j = start; j <= end; j++) {
                    partialSum += j;
                }
 
                // Tampilkan hasil parsial thread ini
                System.out.println("Hasil parsial Thread-" + (threadIdx + 1)
                    + ": " + partialSum);
 
                // Tambahkan hasil parsial ke total akhir secara atomik (thread-safe)
                totalAkhir.addAndGet(partialSum);
            });
        }
 
        // Jalankan semua thread sekaligus
        for (Thread t : threads) t.start();
 
        // Tunggu semua thread selesai sebelum print hasil akhir
        for (Thread t : threads) t.join();
 
        System.out.println();
        System.out.println("--- HASIL AKHIR ---");
        System.out.println("Total penjumlahan 1 sampai " + angkaAkhir
            + " = " + totalAkhir.get());
    }
}