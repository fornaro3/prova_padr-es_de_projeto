
// 1. A interface "Strategy"
// Define o método que todos os algoritmos de cálculo de risco devem implementar.
public interface RiskCalculationStrategy {
    RiskProfile calculate(CustomerData data);
}