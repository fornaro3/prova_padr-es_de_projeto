public class Main {

    public static void main(String[] args) {
        
        // -----------------------------------------------------------------
        // Cenário 1: Cliente jovem, alta renda, alta tolerância
        // -----------------------------------------------------------------
        System.out.println("### CENÁRIO 1 ###");
        CustomerData customer1 = new CustomerData(30, 120000.0, 50000.0, "high");

        // O "Contexto" (Analyzer) é inicializado com a estratégia agressiva
        RiskAnalyzer analyzer = new RiskAnalyzer(new AggressiveModel());
        RiskProfile profile1 = analyzer.analyzeCustomer(customer1);
        System.out.println("Resultado 1: " + profile1);
        System.out.println("---------------------------------");


        // -----------------------------------------------------------------
        // Cenário 2: O mesmo cliente, mas um consultor troca para Conservador
        // -----------------------------------------------------------------
        System.out.println("### CENÁRIO 2 ###");
        // Em tempo de execução, trocamos a estratégia no *mesmo* objeto analyzer.
        analyzer.setStrategy(new ConservativeModel());
        RiskProfile profile2 = analyzer.analyzeCustomer(customer1);
        System.out.println("Resultado 2: " + profile2);
        System.out.println("---------------------------------");

        
        // -----------------------------------------------------------------
        // Cenário 3: Outro cliente, perfil moderado
        // -----------------------------------------------------------------
        System.out.println("### CENÁRIO 3 ###");
        CustomerData customer2 = new CustomerData(45, 70000.0, 150000.0, "medium");

        // Trocamos a estratégia para o modelo Moderado
        analyzer.setStrategy(new ModerateModel());
        RiskProfile profile3 = analyzer.analyzeCustomer(customer2);
        System.out.println("Resultado 3: " + profile3);
        System.out.println("---------------------------------");
    }
}