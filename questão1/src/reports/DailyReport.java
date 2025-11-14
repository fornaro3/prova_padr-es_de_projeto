// 2. Um "Produto Concreto"
// Implementação específica para o relatório diário.
public class DailyReport implements Report {

    @Override
    public void generate() {
        System.out.println("Gerando Relatório Diário...");
        System.out.println("- Buscando dados das últimas 24h.");
        System.out.println("- Compilando métricas de entrega diária.");
    }

    @Override
    public String getDescription() {
        return "Relatório de Operações Diárias";
    }
}