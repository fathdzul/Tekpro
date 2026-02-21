import java.util.Scanner;

class DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        String[] angka = new String[T];

        for (int i=0;i<T;i++) {
            angka[i] = input.next();
        }

        for (int i=0;i<T;i++) {
        try {
            long N = Long.parseLong(angka[i]);

            System.out.println(N + " can be fitted in:");
            if (N >= Byte.MIN_VALUE && N <= Byte.MAX_VALUE) {
                System.out.println("* Byte");
            }
            if (N >= Short.MIN_VALUE && N <= Short.MAX_VALUE) {
                System.out.println("* Short");
            }
            if (N >= Integer.MIN_VALUE && N <= Integer.MAX_VALUE) {
                System.out.println("* Int");
            }
            if (N >= Long.MIN_VALUE && N <= Long.MAX_VALUE) {
                System.out.println("* Long");
            }
        } catch (Exception e) {
            System.out.println(angka[i] + " can't be fitted anywhere.");
        }
        }
        input.close();
    }
}