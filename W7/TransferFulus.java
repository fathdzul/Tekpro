class Account {
    int id;      // Ditambahkan id agar urutan kunci bisa ditentukan (solusi deadlock)
    int balance = 150;
 
    Account(int id) { this.id = id; }
}
 
public class TransferFulus {
 
    // MASALAH AWAL: kode asli melakukan nested synchronized langsung di dalam main,
    // T1 kunci acc1 lalu tunggu acc2, T2 kunci acc2 lalu tunggu acc1 -> DEADLOCK.
    // SOLUSI: pisahkan logic transfer ke method sendiri dengan Fixed Lock Ordering --
    // selalu kunci akun ber-id lebih kecil dulu, sehingga urutan kunci konsisten
    // dari semua thread dan deadlock tidak bisa terjadi.
    public static void transfer(Account from, Account to) {
 
        // Tentukan urutan kunci berdasarkan id akun (Fixed Lock Ordering)
        // Ini solusi utama: semua thread kunci dengan urutan yang sama
        Account first  = (from.id < to.id) ? from : to;
        Account second = (from.id < to.id) ? to   : from;
 
        // Kunci akun dengan id lebih kecil dulu -- tidak bisa deadlock
        // karena T1 dan T2 akan berebut kunci yang SAMA di posisi pertama
        synchronized (first) {
            System.out.println(Thread.currentThread().getName()
                + ": Mengunci Account-" + first.id
                + ", menunggu Account-" + second.id + "...");
 
            // Simulasi jeda. Perlu catch Exception karena Thread.sleep()
            // bisa diinterupsi oleh thread lain (throws InterruptedException)
            try { Thread.sleep(100); } catch (Exception e) {}
 
            // Baru kunci akun kedua setelah yang pertama berhasil
            synchronized (second) {
                System.out.println(Thread.currentThread().getName()
                    + ": Berhasil! Transfer Account-" + from.id
                    + " -> Account-" + to.id);
                to.balance += from.balance; // Operasi transfer dilakukan di sini
            }
        }
    }
 
    public static void main(String[] args) throws InterruptedException {
        Account acc1 = new Account(1); // id=1, balance=150
        Account acc2 = new Account(2); // id=2, balance=150
 
        // Thread 1: Transfer dari acc1 ke acc2
        Thread t1 = new Thread(() -> transfer(acc1, acc2), "Thread-1");
 
        // Thread 2: Transfer dari acc2 ke acc1
        Thread t2 = new Thread(() -> transfer(acc2, acc1), "Thread-2");
 
        t1.start();
        t2.start();
        t1.join(); // Tunggu Thread-1 selesai sebelum lanjut
        t2.join(); // Tunggu Thread-2 selesai sebelum lanjut
 
        System.out.println("--- HASIL AKHIR ---");
        System.out.println("Saldo Akhir acc1: " + acc1.balance);
        System.out.println("Saldo Akhir acc2: " + acc2.balance);
    }
}