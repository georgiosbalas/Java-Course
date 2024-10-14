
public class AnnualTax {

    public static void main(String[] args) {
        double monthlySalary = 800;
        double annualSalary = monthlySalary * 12;
        double taxRate = 0.50; // 50%

        double annualTax = annualSalary * taxRate;

        System.out.println("The annual tax is " + annualTax);

    }
}
