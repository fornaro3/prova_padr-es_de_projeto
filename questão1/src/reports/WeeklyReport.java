// 3. Outro "Produto Concreto"
// Implementação específica para o relatório semanal.
public class WeeklyReport implements Report {

    @Override
    public void generate() {
        System.out.println("Gerando Relatório Semanal...");
        System.out.println("- Conectando ao Data Warehouse.");
        System.out.println("- Priorizando KPIs de performance semanal.");
        System.out.println("- Formatando para PDF executivo.");
    }

    @Override
    public String getDescription() {
        return "Relatório Consolidado da Semana";
    }
}