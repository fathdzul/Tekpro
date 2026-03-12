// Class GenericsType menggunakan parameter tipe T (generic) yang lebih aman dari Object
public class GenericsType<T> {

    // Variabel t bertipe T, tipe datanya ditentukan saat pembuatan objek
    private T t;

    // Getter: mengembalikan nilai dengan tipe yang sudah ditentukan (T)
    public T get() {
        return this.t;
    }

    // Setter: menerima nilai dengan tipe T, tidak bisa diisi sembarangan tipe
    public void set(T t1) {
        this.t = t1;
    }

    public static void main(String args[]) {
        // Membuat objek GenericsType khusus String, hanya bisa diisi String (type-safe)
        GenericsType<String> type = new GenericsType<>();
        type.set("Java"); // valid, karena tipe sudah dikunci ke String
        System.out.println("Isi type (String): " + type.get());

        // Raw type: tanpa parameter tipe, mirip GenericsTypeOld (tidak direkomendasikan)
        GenericsType type1 = new GenericsType();
        type1.set("Java"); // valid, bisa diisi String
        System.out.println("Isi type1 setelah set String: " + type1.get());

        // Autoboxing: int 10 otomatis di-box jadi Integer dan bisa tersimpan
        type1.set(10); // valid, karena raw type menerima Object apapun
        System.out.println("Isi type1 setelah set Integer: " + type1.get());
    }

}
