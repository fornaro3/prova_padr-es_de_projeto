// 7. O "Cliente"
// O núcleo do sistema que usa a fábrica para criar relatórios.
public class Main {

    public static void main(String[] args) {
        // O cliente decide qual fábrica usar com base em alguma lógica.
        
        // Cenário 1: Precisamos de um relatório diário.
        ReportFactory dailyFactory = new DailyReportFactory();
        // O cliente chama o método da fábrica, sem saber
        // como o relatório é de fato criado.
        dailyFactory.processReport();

        // Cenário 2: Precisamos de um relatório semanal.
        ReportFactory weeklyFactory = new WeeklyReportFactory();
        weeklyFactory.processReport();

    }
}