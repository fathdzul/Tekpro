import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many Salesperson do you want to sort? ");
        size = scan.nextInt();
        scan.nextLine();
        Salesperson[] salesStaff = new Salesperson[size];
        for (int i = 0; i < size; i++) {
            System.out.println("\nSalesperson number  " + (i + 1) + ":");
            
            System.out.print("First Name: ");
            String firstName = scan.nextLine();
            
            System.out.print("Last Name: ");
            String lastName = scan.nextLine();
            
            System.out.print("Total Sales: ");
            int sales = scan.nextInt();
            
            scan.nextLine(); 
            
            salesStaff[i] = new Salesperson(firstName, lastName, sales);
        }
        Sorting.insertionSort(salesStaff);
        System.out.println("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff)
            System.out.println(s);
        scan.close();
    }
}