// 4. O "Creator" Abstrato
// Declara o "Factory Method" que retorna um objeto do tipo Report.
public abstract class ReportFactory {

    public abstract Report createReport();

    // A classe Factory também pode ter lógica comum.
    public void processReport() {
        Report report = createReport();
        System.out.println("Iniciando processamento para: " + report.getDescription());
        report.generate();
        System.out.println("Processamento concluído.\n");
    }
}