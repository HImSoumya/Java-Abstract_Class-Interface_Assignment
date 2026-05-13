// Design an interface `Printable` with method `print()`. Implement classes `PDFDocument` and `WordDocument`.

interface Printable {
    void print(String fileName);
}

class PDFDocument implements Printable {
    @Override
    public void print(String fileName) {
        System.out.println("Processing " + fileName + ", For Printing...");
        System.out.println("Printing Successful...");
    }
}

class WordDocument implements Printable {
    @Override
    public void print(String fileName) {
        System.out.println("Processing " + fileName + ", For Printing...");
        System.out.println("Printing Successful...");
    }
}

public class Main {

    public static void main(String[] args) {
        Printable p;

        p = new PDFDocument();
        p.print("Soumya-RB-Resume.pdf");

        p = new PDFDocument();
        p.print("Java-Documentation.word");
    }
}