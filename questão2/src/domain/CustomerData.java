public class CustomerData {
    private int age;
    private double income;
    private double existingInvestments;
    private String riskToleranceQuestionnaire;

    public CustomerData(int age, double income, double existingInvestments, String tolerance) {
        this.age = age;
        this.income = income;
        this.existingInvestments = existingInvestments;
        this.riskToleranceQuestionnaire = tolerance;
    }

    // Getters
    public int getAge() { return age; }
    public double getIncome() { return income; }
    public double getExistingInvestments() { return existingInvestments; }
    public String getRiskToleranceQuestionnaire() { return riskToleranceQuestionnaire; }
}