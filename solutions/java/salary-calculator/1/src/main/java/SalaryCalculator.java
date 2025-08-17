public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double multiplier = (daysSkipped<5)?1.0:0.85;
        return multiplier;
    }

    public int bonusMultiplier(int productsSold) {
        int bm = (productsSold>=20)?13:10;
        return bm;
    }

    public double bonusForProductsSold(int productsSold) {
        return this.bonusMultiplier(productsSold)*productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000.00*this.salaryMultiplier(daysSkipped)+this.bonusForProductsSold(productsSold);
        return salary>=2000.00?2000.00:salary;
    } 
}
