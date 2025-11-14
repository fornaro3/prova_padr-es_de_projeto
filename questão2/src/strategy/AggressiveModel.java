public class AggressiveModel implements RiskCalculationStrategy {

    @Override
    public RiskProfile calculate(CustomerData data) {
        System.out.println("Calculando com 'Modelo Agressivo':");
        System.out.println("-> Foco em alta renda e tolerância ao risco alta.");

        // Lógica de exemplo
        int score = 70;
        if (data.getIncome() > 100000) score += 15;
        if (data.getRiskToleranceQuestionnaire().equals("high")) score += 15;
        if (data.getAge() < 40) score += 5;

        return new RiskProfile(RiskProfile.RiskLevel.AGRESSIVO, Math.min(score, 100));
    }
}