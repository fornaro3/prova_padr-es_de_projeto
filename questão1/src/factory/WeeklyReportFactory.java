// 6. Outro "Creator Concreto"
// Implementa o Factory Method para retornar um WeeklyReport.
public class WeeklyReportFactory extends ReportFactory {

    @Override
    public Report createReport() {
        return new WeeklyReport();
    }
}