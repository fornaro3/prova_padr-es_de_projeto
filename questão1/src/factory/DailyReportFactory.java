// 5. Um "Creator Concreto"
// Implementa o Factory Method para retornar um DailyReport.
public class DailyReportFactory extends ReportFactory {

    @Override
    public Report createReport() {
        return new DailyReport();
    }
}