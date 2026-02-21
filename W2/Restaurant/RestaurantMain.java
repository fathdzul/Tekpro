package Restaurant;
import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        String lanjutPesan;
        Scanner input = new Scanner(System.in);
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Pizza", 250000, 20);
        Restaurant.nextId();

        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        Restaurant.nextId();

        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        Restaurant.nextId();

        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);

        System.out.println("Daftar Menu");
        menu.tampilMenuMakanan();

        do {
            System.out.println("Masukkan nama menu yang ingin anda pesan");
            String nama = input.nextLine();
            System.out.println("Masukkan Jumlah pesanan yang ingin anda pesan");
            int jumlahPesanan = input.nextInt();

            input.nextLine();

            menu.pesan(nama, jumlahPesanan);
            
            System.out.print("\nApakah Anda ingin memesan menu lain? (y/n): ");
            lanjutPesan = input.nextLine();
        } while (lanjutPesan.equalsIgnoreCase("y"));

        menu.tampilMenuMakanan();

        input.close();
    }
}

