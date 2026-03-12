// Interface MinMax dengan bounded type parameter: T harus implement Comparable<T>
// sehingga elemen-elemennya bisa dibandingkan menggunakan compareTo()
interface MinMax<T extends Comparable<T>> {
    T max(); // method yang wajib diimplementasi oleh class yang menggunakan interface ini
}

// MyClass mengimplementasi MinMax dan menyimpan array bertipe T
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals; // array generik untuk menyimpan data

    // Constructor: menerima array bertipe T dan menyimpannya
    MyClass(T[] o) {
        vals = o;
    }

    // Implementasi method max(): mencari nilai terbesar menggunakan compareTo()
    public T max() {
        T v = vals[0]; // anggap elemen pertama sebagai nilai terbesar sementara
        for (int i = 1; i < vals.length; i++) {
            // compareTo() > 0 berarti vals[i] lebih besar dari v saat ini
            if (vals[i].compareTo(v) > 0) {
                v = vals[i]; // perbarui nilai terbesar
            }
        }
        return v;
    }
}

public class Main {
    public static void main(String[] args) {
        Integer[] inums = {3, 6, 2, 8, 6}; // array Integer
        Character[] chs = {'b', 'r', 'p', 'w'}; // array Character

        // Membuat objek MyClass dengan masing-masing tipe
        MyClass<Integer> a = new MyClass<>(inums);
        MyClass<Character> b = new MyClass<>(chs);

        // Menampilkan nilai terbesar dari setiap array
        System.out.println("Nilai Integer Terbesar: " + a.max()); // output: 8
        System.out.println("Karakter Terbesar: " + b.max());      // output: w
    }
}