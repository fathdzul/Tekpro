// Bounded Generic Class: T extends A berarti T harus class A atau subclass-nya
// Ini memastikan objRef selalu punya method displayClass() milik class A
class Bound<T extends A> {
    private T objRef;

    // Constructor menerima objek bertipe T (A atau turunannya)
    public Bound(T obj) {
        this.objRef = obj;
    }

    // Karena T extends A, method milik class A bisa dipanggil dengan aman
    public void doRunTest() {
        this.objRef.displayClass(); // polimorfisme: versi yang dipanggil sesuai objek aslinya
    }
}

// Super class A dengan method displayClass()
class A {
    public void displayClass() {
        System.out.println("Inside super class A");
    }
}

// Sub class B meng-override displayClass() milik A
class B extends A {
    public void displayClass() {
        System.out.println("Inside sub class B");
    }
}

// Sub class C juga meng-override displayClass() milik A
class C extends A {
    public void displayClass() {
        System.out.println("Inside sub class C");
    }
}

public class BoundedClass {
    public static void main(String a[]) {
        // Bound<C>: parameter tipe adalah C (subclass A), valid
        Bound<C> bec = new Bound<C>(new C());
        bec.doRunTest(); // output: Inside sub class C

        // Bound<B>: parameter tipe adalah B (subclass A), valid
        Bound<B> beb = new Bound<B>(new B());
        beb.doRunTest(); // output: Inside sub class B

        // Bound<A>: parameter tipe adalah A sendiri (super class), juga valid
        Bound<A> bea = new Bound<A>(new A());
        bea.doRunTest(); // output: Inside super class A
    }
}