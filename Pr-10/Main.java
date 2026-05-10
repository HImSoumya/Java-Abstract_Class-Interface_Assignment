// Create an abstract class `Report` with method `generateReport()`. Implement subclasses `PDFReport` and `ExcelReport`.
abstract class Report {

    abstract void generateReport();
}

class PDFReport extends Report {

    @Override
    void generateReport() {
        System.out.println("Generating PDF Report...");
        System.out.println("PDF Report generated successfully.");
    }
}

class ExcelReport extends Report {

    @Override
    void generateReport() {
        System.out.println("Generating Excel Report...");
        System.out.println("Excel Report generated successfully.");
    }
}

public class Main {

    public static void main(String[] args) {

        Report r;

        r = new PDFReport();
        r.generateReport();

        System.out.println();

        r = new ExcelReport();
        r.generateReport();
    }
}