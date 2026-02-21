
abstract class InsurancePolicy {
    abstract double calculatePremium();
    abstract void getPolicyDetails();
}
class HealthInsurance extends InsurancePolicy {
    private double coverageAmount;
    public double getCoverageAmount() {
        return coverageAmount;
    }
    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }
    @Override
    double calculatePremium() {
         return coverageAmount * 0.05;
    }

    void getPolicyDetails() {
    	System.out.println();
        System.out.println("Health Insurance Policy");
        System.out.println("Coverage Amount: " + coverageAmount);
        System.out.println("Premium: " + calculatePremium());
    }
}
class VehicleInsurance extends InsurancePolicy {
    private String vehicleType;
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    double calculatePremium() {
        switch(vehicleType.toLowerCase()) {
            case "car": return 7667;
            case "bike":return 9669;
            default: return 3000; 
        }
    }
    void getPolicyDetails() {
    	System.out.println();
        System.out.println("Vehicle Insurance Policy");
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Premium: " + calculatePremium());
    }
}
public class Insurancemanasys{
    public static void main(String[] args) {      
        HealthInsurance healthPolicy = new HealthInsurance();
        healthPolicy.setCoverageAmount(100000);
        healthPolicy.getPolicyDetails();
        VehicleInsurance vehiclePolicy = new VehicleInsurance();
        vehiclePolicy.setVehicleType("Car");
        vehiclePolicy.getPolicyDetails();
        System.out.println();
        InsurancePolicy[] policies = {healthPolicy, vehiclePolicy};
        System.out.println("Policy details");
        for(InsurancePolicy policy : policies) {
            policy.getPolicyDetails();
            System.out.println();
    }
}
}