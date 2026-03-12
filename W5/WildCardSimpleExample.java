import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Wildcard Arguments With An Unknown Type
 * @author javaguides.net
 **/
public class WildCardSimpleExample {

    // Wildcard <?> berarti method ini bisa menerima Collection dengan tipe apapun
    // Tanpa wildcard, harus buat overload terpisah untuk tiap tipe (String, Integer, dll.)
    public static void printCollection(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e); // setiap elemen diakses sebagai Object
        }
    }

    public static void main(String[] args) {
        // ArrayList: collection berbasis array dinamis
        Collection<String> collection = new ArrayList<>();
        collection.add("ArrayList Collection");
        printCollection(collection);

        // LinkedList: collection berbasis doubly linked list
        Collection<String> collection2 = new LinkedList<>();
        collection2.add("LinkedList Collection");
        printCollection(collection2);

        // HashSet: collection yang tidak mengizinkan duplikat, tanpa urutan tertentu
        Collection<String> collection3 = new HashSet<>();
        collection3.add("HashSet Collection");
        printCollection(collection3);

        // Mencoba printCollection dengan beberapa elemen sekaligus
        Collection<String> multi = new ArrayList<>();
        multi.add("Element Pertama");
        multi.add("Element Kedua");
        multi.add("Element Ketiga");
        System.out.println("--- Multi Collection ---");
        printCollection(multi);
    }

}