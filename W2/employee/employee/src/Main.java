import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class Main {
    public static void main(String[] args) {
        Department deptIT = new Department("Information Technology");
        EmploymentType typeFullTime = new EmploymentType("Full-Time");

        Employee emp1 = new Employee(67, "Fatih Izzul", deptIT, typeFullTime, 5000000);
        Employee emp2 = new Employee(68, "Ujang", deptIT, typeFullTime, 4500000);

        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        System.out.println("=== DATA PEGAWAI AWAL ===");
        System.out.println("Nama: " + service.getEmployee(67).getName());
        System.out.println("Gaji: Rp " + service.getEmployee(67).getSalary());
        
        System.out.println("\n=== SETELAH NAIK GAJI 10% ===");
        service.raiseSalary(67, 10);
        System.out.println("Nama: " + service.getEmployee(67).getName());
        System.out.println("Gaji Baru: Rp " + service.getEmployee(67).getSalary());

        System.out.println("\n=== INFO PERUSAHAAN ===");
        
        System.out.println("Total Pegawai Terdaftar: " + Employee.getTotalEmployee()); 
    }
}
