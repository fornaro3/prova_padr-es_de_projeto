public class ModerateModel implements RiskCalculationStrategy {

    @Override
    public RiskProfile calculate(CustomerData data) {
        System.out.println("Calculando com 'Modelo Moderado':");
        System.out.println("-> Ponderando idade, renda e tolerância.");

        // Lógica de exemplo simplificada
        int score = 40; // Começa na base moderada

        // Ajusta baseado na renda
        if (data.getIncome() > 80000) {
            score += 10;
        } else if (data.getIncome() < 40000) {
            score -= 10;
        }

        // Ajusta baseado na idade
        if (data.getAge() > 50) {
            score -= 10;
        } else if (data.getAge() < 35) {
            score += 10;
        }

        // Ajusta baseado no questionário
        if (data.getRiskToleranceQuestionnaire().equals("high")) {
            score += 15;
        } else if (data.getRiskToleranceQuestionnaire().equals("low")) {
            score -= 15;
        }
        
        // Garante que a pontuação fique entre 0 e 100
        score = Math.max(0, Math.min(100, score));

        return new RiskProfile(RiskProfile.RiskLevel.MODERADO, score);
    }
}