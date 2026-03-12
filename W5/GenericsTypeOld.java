// Sebuah class dengan tipe data generik yang lama, menggunakan Object sebagai tipe data
public class GenericsTypeOld {

    // Menggunakan Object sebagai tipe data, sehingga dapat menyimpan berbagai jenis data
    private Object t;

    // Getter dan setter untuk tipe data generik
    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    // Contoh penggunaan class dengan tipe data generik yang lama
    public static void main(String args[]) {
        GenericsTypeOld type = new GenericsTypeOld(); // Membuat instance dari class dengan tipe
        type.set("Java"); // Menyimpan sebuah String, tetapi tipe data yang digunakan adalah Object
        // String str = (String) type.get(); // type casting, error prone and can cause ClassCastException
        System.out.println(type.get());

    }
}