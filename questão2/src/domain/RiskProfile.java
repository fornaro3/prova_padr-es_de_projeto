public class RiskProfile {
    public enum RiskLevel { CONSERVADOR, MODERADO, AGRESSIVO }

    private RiskLevel level;
    private int score; // Pontuação de 0 a 100

    public RiskProfile(RiskLevel level, int score) {
        this.level = level;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Perfil de Risco: " + level + " (Pontuação: " + score + ")";
    }
}