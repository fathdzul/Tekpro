// Class ini bergantung pada GenericsType<T> dari soal No. 2
public class GenericsMethods {

    // Generic Method: <T> di depan return type menandai ini adalah method generik
    // Bisa membandingkan dua GenericsType<T> dengan tipe T apapun
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
        // equals() membandingkan nilai di dalam kedua objek
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]) {
        // Membuat dua objek GenericsType<String> dengan nilai yang sama
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Java");

        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Java");

        // Cara 1: eksplisit menyebutkan tipe <String> saat memanggil generic method
        boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
        System.out.println("isEqual (cara eksplisit): " + isEqual); // true

        // Cara 2: type inference - compiler otomatis menebak tipe dari argumen
        isEqual = GenericsMethods.isEqual(g1, g2);
        System.out.println("isEqual (type inference): " + isEqual); // true

        // Mencoba dengan nilai yang berbeda untuk membuktikan hasilnya false
        g2.set("Python");
        System.out.println("isEqual setelah g2 diganti: " + GenericsMethods.isEqual(g1, g2)); // false
    }

}