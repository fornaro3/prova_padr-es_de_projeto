public class ConservativeModel implements RiskCalculationStrategy {

    @Override
    public RiskProfile calculate(CustomerData data) {
        System.out.println("Calculando com 'Modelo Conservador':");
        System.out.println("-> Foco na idade e preservação de capital.");

        // Lógica de exemplo
        int score = 10;
        if (data.getAge() > 60) score += 20;
        if (data.getRiskToleranceQuestionnaire().equals("low")) score += 15;
        if (data.getExistingInvestments() > 50000) score -= 5;

        return new RiskProfile(RiskProfile.RiskLevel.CONSERVADOR, Math.max(score, 0));
    }
}