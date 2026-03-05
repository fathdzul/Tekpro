public class Commission extends Hourly {
    private double totalSales;
    private double comsRate;
    
    /* CONSTRUCTOR */
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double hourRate, double comsRate) {
        super(eName, eAddress, ePhone, socSecNumber, hourRate);
        this.comsRate = comsRate;
    }

    // Method to add total sales
    public void addSales(double totalSales) {
        this.totalSales = totalSales;
    }

    // Override pay method in superclass to add commission payment
    @Override
    public double pay() {
        double payment = super.pay() + totalSales * comsRate;
        totalSales = 0;
        return payment;
    }

    // Override toString method to add total sales
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales : " + totalSales;
        return result;
    }
}
