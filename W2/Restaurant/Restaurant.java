package Restaurant;
public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public String getNamaMakanan(int id) {
        return this.nama_makanan[id];
    }

    public double getHargaMakanan(int id) {
        return this.harga_makanan[id];
    }

    public int getStok(int id) {
        return this.stok[id];
    }

    public byte getId() {
        return id;
    }

    public void setNamaMakanan(int id, String nama) {
        this.nama_makanan[id] = nama;
    }

    public void setHargaMakanan(int id, double harga) {
        this.harga_makanan[id] = harga;
    }

    public void setStok(int id, int stok) {
        if (stok < 0) {
            System.out.println("Stok tidak boleh negatif!");
        } else {
            this.stok[id] = stok;
        }
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        setNamaMakanan(id, nama);
        setHargaMakanan(id, harga);
        setStok(id, stok);
}

public void tampilMenuMakanan() {
    for (int i = 0; i <= id; i++) {
        if (!isOutOfStock(i)) {
            System.out.println(
                getNamaMakanan(i) + "[" + getStok(i) + "]" + "\tRp. " + getHargaMakanan(i)
            );
        }
    }
}

public boolean isOutOfStock(int id) {
    if (getStok(id) == 0) {
        return true;
    } else {
        return false;
    }
}

public static void nextId() {
    id++;
}

public void pesan(String nama, int jumlahPesanan) {
    System.out.println("Pesanan: " + nama + " " + jumlahPesanan + "pcs");
    for(int i=0; i <= id; i++) {
        if(nama.equalsIgnoreCase(getNamaMakanan(i))) {
            if(jumlahPesanan <= getStok(i)) {
                setStok(i, getStok(i)-jumlahPesanan);
                System.out.println("Pesanan Berhasil!");
            } else {
                System.out.println("Jumlah Pesanan Melebihi Stok!");
            }
            return;
        }
    }
    System.out.println("Makanan tidak terdapat pada Menu!");
}

}