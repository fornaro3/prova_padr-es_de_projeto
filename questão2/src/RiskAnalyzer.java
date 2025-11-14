// 4. O "Contexto"
// Mantém uma referência à estratégia atual.
public class RiskAnalyzer {

    private RiskCalculationStrategy strategy;

    // A estratégia é injetada (pode ser no construtor ou via setter)
    public RiskAnalyzer(RiskCalculationStrategy initialStrategy) {
        this.strategy = initialStrategy;
    }

    /**
     * Este método permite trocar a estratégia dinamicamente
     * em tempo de execução.
     */
    public void setStrategy(RiskCalculationStrategy strategy) {
        System.out.println("\n[Sistema: Trocando estratégia de cálculo.]");
        this.strategy = strategy;
    }

    /**
     * O Contexto delega a execução para o objeto da estratégia.
     * O fluxo principal de análise não muda,
     * independentemente da estratégia usada.
     */
    public RiskProfile analyzeCustomer(CustomerData data) {
        System.out.println("Iniciando análise para cliente de " + data.getAge() + " anos.");

        RiskProfile profile = this.strategy.calculate(data);
    
        System.out.println("Análise concluída.");
        return profile;
    }
}